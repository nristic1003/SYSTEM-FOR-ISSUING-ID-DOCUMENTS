/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entiteti;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kalu
 */
@Entity
@Table(name = "documentrequest")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Documentrequest.findAll", query = "SELECT d FROM Documentrequest d"),
    @NamedQuery(name = "Documentrequest.findByIdDR", query = "SELECT d FROM Documentrequest d WHERE d.idDR = :idDR"),
    @NamedQuery(name = "Documentrequest.findByJmbg", query = "SELECT d FROM Documentrequest d WHERE d.jmbg = :jmbg"),
    @NamedQuery(name = "Documentrequest.findByIme", query = "SELECT d FROM Documentrequest d WHERE d.ime = :ime"),
    @NamedQuery(name = "Documentrequest.findByPrezime", query = "SELECT d FROM Documentrequest d WHERE d.prezime = :prezime"),
    @NamedQuery(name = "Documentrequest.findByImemajke", query = "SELECT d FROM Documentrequest d WHERE d.imemajke = :imemajke"),
    @NamedQuery(name = "Documentrequest.findByPrezimemajke", query = "SELECT d FROM Documentrequest d WHERE d.prezimemajke = :prezimemajke"),
    @NamedQuery(name = "Documentrequest.findByImeoca", query = "SELECT d FROM Documentrequest d WHERE d.imeoca = :imeoca"),
    @NamedQuery(name = "Documentrequest.findByPrezimeoca", query = "SELECT d FROM Documentrequest d WHERE d.prezimeoca = :prezimeoca"),
    @NamedQuery(name = "Documentrequest.findByPol", query = "SELECT d FROM Documentrequest d WHERE d.pol = :pol"),
    @NamedQuery(name = "Documentrequest.findByDatumRodjenja", query = "SELECT d FROM Documentrequest d WHERE d.datumRodjenja = :datumRodjenja"),
    @NamedQuery(name = "Documentrequest.findByNacionalnost", query = "SELECT d FROM Documentrequest d WHERE d.nacionalnost = :nacionalnost"),
    @NamedQuery(name = "Documentrequest.findByProfesija", query = "SELECT d FROM Documentrequest d WHERE d.profesija = :profesija"),
    @NamedQuery(name = "Documentrequest.findByBracnoStanje", query = "SELECT d FROM Documentrequest d WHERE d.bracnoStanje = :bracnoStanje"),
    @NamedQuery(name = "Documentrequest.findByOpstinaPrebivalista", query = "SELECT d FROM Documentrequest d WHERE d.opstinaPrebivalista = :opstinaPrebivalista"),
    @NamedQuery(name = "Documentrequest.findByUlicaPrebivalista", query = "SELECT d FROM Documentrequest d WHERE d.ulicaPrebivalista = :ulicaPrebivalista"),
    @NamedQuery(name = "Documentrequest.findByBrojPrebivalista", query = "SELECT d FROM Documentrequest d WHERE d.brojPrebivalista = :brojPrebivalista"),
    @NamedQuery(name = "Documentrequest.findByStatus", query = "SELECT d FROM Documentrequest d WHERE d.status = :status"),
    @NamedQuery(name = "Documentrequest.findByIdRC", query = "SELECT d FROM Documentrequest d WHERE d.idRC = :idRC")})
public class Documentrequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDR")
    private Integer idDR;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "JMBG")
    private String jmbg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Ime")
    private String ime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Prezime")
    private String prezime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Ime_majke")
    private String imemajke;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Prezime_majke")
    private String prezimemajke;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Ime_oca")
    private String imeoca;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Prezime_oca")
    private String prezimeoca;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Pol")
    private String pol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DatumRodjenja")
    private String datumRodjenja;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nacionalnost")
    private String nacionalnost;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Profesija")
    private String profesija;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "BracnoStanje")
    private String bracnoStanje;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "OpstinaPrebivalista")
    private String opstinaPrebivalista;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "UlicaPrebivalista")
    private String ulicaPrebivalista;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "BrojPrebivalista")
    private String brojPrebivalista;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Status")
    private String status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "idRC")
    private String idRC;

    public Documentrequest() {
    }

    public Documentrequest(Integer idDR) {
        this.idDR = idDR;
    }

    public Documentrequest(Integer idDR, String jmbg, String ime, String prezime, String imemajke, String prezimemajke, String imeoca, String prezimeoca, String pol, String datumRodjenja, String nacionalnost, String profesija, String bracnoStanje, String opstinaPrebivalista, String ulicaPrebivalista, String brojPrebivalista, String status, String idRC) {
        this.idDR = idDR;
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.imemajke = imemajke;
        this.prezimemajke = prezimemajke;
        this.imeoca = imeoca;
        this.prezimeoca = prezimeoca;
        this.pol = pol;
        this.datumRodjenja = datumRodjenja;
        this.nacionalnost = nacionalnost;
        this.profesija = profesija;
        this.bracnoStanje = bracnoStanje;
        this.opstinaPrebivalista = opstinaPrebivalista;
        this.ulicaPrebivalista = ulicaPrebivalista;
        this.brojPrebivalista = brojPrebivalista;
        this.status = status;
        this.idRC = idRC;
    }

    public Integer getIdDR() {
        return idDR;
    }

    public void setIdDR(Integer idDR) {
        this.idDR = idDR;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getImemajke() {
        return imemajke;
    }

    public void setImemajke(String imemajke) {
        this.imemajke = imemajke;
    }

    public String getPrezimemajke() {
        return prezimemajke;
    }

    public void setPrezimemajke(String prezimemajke) {
        this.prezimemajke = prezimemajke;
    }

    public String getImeoca() {
        return imeoca;
    }

    public void setImeoca(String imeoca) {
        this.imeoca = imeoca;
    }

    public String getPrezimeoca() {
        return prezimeoca;
    }

    public void setPrezimeoca(String prezimeoca) {
        this.prezimeoca = prezimeoca;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(String datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getNacionalnost() {
        return nacionalnost;
    }

    public void setNacionalnost(String nacionalnost) {
        this.nacionalnost = nacionalnost;
    }

    public String getProfesija() {
        return profesija;
    }

    public void setProfesija(String profesija) {
        this.profesija = profesija;
    }

    public String getBracnoStanje() {
        return bracnoStanje;
    }

    public void setBracnoStanje(String bracnoStanje) {
        this.bracnoStanje = bracnoStanje;
    }

    public String getOpstinaPrebivalista() {
        return opstinaPrebivalista;
    }

    public void setOpstinaPrebivalista(String opstinaPrebivalista) {
        this.opstinaPrebivalista = opstinaPrebivalista;
    }

    public String getUlicaPrebivalista() {
        return ulicaPrebivalista;
    }

    public void setUlicaPrebivalista(String ulicaPrebivalista) {
        this.ulicaPrebivalista = ulicaPrebivalista;
    }

    public String getBrojPrebivalista() {
        return brojPrebivalista;
    }

    public void setBrojPrebivalista(String brojPrebivalista) {
        this.brojPrebivalista = brojPrebivalista;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdRC() {
        return idRC;
    }

    public void setIdRC(String idRC) {
        this.idRC = idRC;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDR != null ? idDR.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documentrequest)) {
            return false;
        }
        Documentrequest other = (Documentrequest) object;
        if ((this.idDR == null && other.idDR != null) || (this.idDR != null && !this.idDR.equals(other.idDR))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entiteti.Documentrequest[ idDR=" + idDR + " ]";
    }
    
}
