/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import entiteti.Documentrequest;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jms.ConnectionFactory;
import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.json.JSONObject;
import sun.reflect.generics.tree.FormalTypeParameter;

/**
 *
 * @author Kalu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    @Resource(lookup = "myqueue")
    static Queue queue; 
    @Resource(lookup = "jms/__defaultConnectionFactory")
    static ConnectionFactory connectionFactory;
    
    
    
    
    public static void main(String[] args) {
        JMSContext context = connectionFactory.createContext();
        JMSConsumer consumer = context.createConsumer(queue);
        JMSProducer producer = context.createProducer();
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ServerPU");
                   

        while(true){
            System.out.println("Pokrenut server");
            try{
                Message msg = consumer.receive();
                if( (msg!=null) && (msg instanceof ObjectMessage) ){
                    
                    ObjectMessage obj = (ObjectMessage) msg;
                    Documentrequest dr = (Documentrequest) obj.getObject();
                    JSONObject json = new JSONObject();
                    
                    json.put("id",dr.getIdRC());
                    json.put("ime",dr.getIme());
                    json.put("prezime",dr.getPrezime());
                    json.put("imeMajke",dr.getImemajke());
                    json.put("imeOca",dr.getImeoca());
                    json.put("prezimeMajke",dr.getPrezimemajke());                   
                    json.put("prezimeOca",dr.getPrezimeoca());
                    json.put("pol",dr.getPol());
                    json.put("datumRodjenja",dr.getDatumRodjenja());
                    json.put("nacionalnost",dr.getNacionalnost());
                    json.put("profesija",dr.getProfesija());
                    json.put("bracnoStanje",dr.getBracnoStanje());
                    json.put("opstinaPrebivalista",dr.getOpstinaPrebivalista());
                    json.put("ulicaPrebivalista",dr.getUlicaPrebivalista());
                    json.put("brojPrebivalista",dr.getBrojPrebivalista());
                    json.put("JMBG",dr.getJmbg());
                    System.out.println(json.toString());
                    
                    
                    
                   
                    URL url = new URL("http://collabnet.netset.rs:8081/is/persoCentar/submit");
                    HttpURLConnection connection = (HttpURLConnection)url.openConnection();
                    connection.setDoOutput(true);
                    connection.setDoInput(true);
                    connection.setRequestProperty("Content-Type", "application/json");
                    connection.setRequestProperty("Accept", "application/json");
                    connection.setRequestMethod("POST");                    
                    OutputStream outputStream = connection.getOutputStream();
                    byte[] b = json.toString().getBytes("UTF-8");
                    outputStream.write(b);
                    
                    
                    if(connection.getResponseCode() == HttpURLConnection.HTTP_OK){
                        System.out.println("Status OK!");
                        EntityManager entityManager = entityManagerFactory.createEntityManager();
                       // Documentrequest dr_update = entityManager.find(Documentrequest.class, dr.getIdDR());
                        dr.setStatus("U produkciji");
                        entityManager.getTransaction().begin();
                        entityManager.merge(dr);
                        entityManager.getTransaction().commit();
                        entityManager.close();
                        
                    }
                    else{
                        System.out.println("Status Not Ok!");
                       long idc =  Long.parseLong(dr.getIdRC());
                       idc++;
                       String idrc = ((Long)idc).toString();
                       dr.setIdRC(idrc);
                        EntityManager entityManager = entityManagerFactory.createEntityManager();
                        entityManager.getTransaction().begin();
                        entityManager.merge(dr);
                        entityManager.getTransaction().commit();
                        entityManager.close();     
                        ObjectMessage obj_msg = context.createObjectMessage();
                        obj_msg.setObject(dr);
                        producer.send(queue, obj_msg);
                          
                        
                    }
                    
 
                    
                    
                    
                }
                
                
  
            }
            catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
