CREATE DATABASE  IF NOT EXISTS `documentrequest` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `documentrequest`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: documentrequest
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `documentrequest`
--

DROP TABLE IF EXISTS `documentrequest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `documentrequest` (
  `idDR` int NOT NULL,
  `JMBG` varchar(13) NOT NULL,
  `Ime` varchar(45) NOT NULL,
  `Prezime` varchar(45) NOT NULL,
  `Ime_majke` varchar(45) NOT NULL,
  `Prezime_majke` varchar(45) NOT NULL,
  `Ime_oca` varchar(45) NOT NULL,
  `Prezime_oca` varchar(45) NOT NULL,
  `Pol` varchar(45) NOT NULL,
  `DatumRodjenja` varchar(45) NOT NULL,
  `Nacionalnost` varchar(45) NOT NULL,
  `Profesija` varchar(45) NOT NULL,
  `BracnoStanje` varchar(45) NOT NULL,
  `OpstinaPrebivalista` varchar(45) NOT NULL,
  `UlicaPrebivalista` varchar(45) NOT NULL,
  `BrojPrebivalista` varchar(45) NOT NULL,
  `Status` varchar(45) NOT NULL,
  `idRC` varchar(45) NOT NULL,
  PRIMARY KEY (`idDR`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `documentrequest`
--

LOCK TABLES `documentrequest` WRITE;
/*!40000 ALTER TABLE `documentrequest` DISABLE KEYS */;
INSERT INTO `documentrequest` VALUES (1,'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'),(2,'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'),(3,'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'),(4,'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'),(5,'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','173530000005'),(6,'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','Kreiran','173530000006'),(7,'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','Kreiran','173530000007'),(8,'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','Kreiran','173530000008'),(9,'1702998710047','Luka','Simic','Julijana','Simic','Nebojsa','Simic','M','1998-02-17','Srbin','Student','neozenjen/a','Vozdovac','Medakoviceva','81','Kreiran','173530000009'),(10,'1702998710047','Luka','Simic','Julijana','Simic','Nebojsa','Simic','M','1998-02-17','Srbin','Student','neozenjen/a','Vozdovac','Medakoviceva','81','Kreiran','173530000010'),(11,'3123123','a','a','a','a','a','a','M','a','a','a','a','a','a','a','Kreiran','173530000011'),(12,'1702998710047','Luka','Simic','Julijana','Simic','Nebojsa','Simic','M','1998-02-17','Srbin','Student','neozenjen/a','Vozdovac','Medakoviceva','81','Kreiran','173530000012'),(13,'1702998710047','a','a','a','a','a','a','M','1998-02-17','a','a','neozenjen/a','a','a','81','Kreiran','173530000013'),(14,'1702998710047','a','a','a','a','a','a','M','1998-02-17','a','a','neozenjen/a','a','a','81','Kreiran','173530000014'),(15,'1702998710047','a','a','a','a','a','a','M','1998-02-17','a','a','neozenjen/a','a','a','81','Kreiran','173530000015'),(16,'1702998710046','a','a','a','a','a','a','M','1998-02-17','a','a','neozenjen/a','a','a','81','Kreiran','173530000016'),(17,'1702998710046','a','a','a','a','a','a','M','1998-02-17','a','a','neozenjen/a','a','a','81','Kreiran','173530000017'),(18,'1702998710046','a','a','a','a','a','a','M','1998-02-02','a','a','neozenjen/a','a','a','81','Kreiran','173530000018'),(19,'1702998710045','a','a','a','a','a','a','M','1998-02-02','a','a','neozenjen/a','a','a','81','Kreiran','173530000019'),(20,'1702998710047','1','1','1','1','1','1','M','1998-02-02','1','1','neozenjen/a','1','1','81','Dokument urucen','173530000020'),(21,'1702998710045','a','a','a','a','a','a','M','1990-01-01','a','a','neozenjen/a','a','a','81','Dokument urucen','173530000021'),(22,'1111111111111','asdasd','sadasd','sadasd','asdadsas','sdaads','dsaasd','M','2017-01-01','ddfs','fsddsf','neozenjen/a','dsaasd','asdads','dasds','Dokument urucen','173530000023');
/*!40000 ALTER TABLE `documentrequest` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-12  5:03:49
