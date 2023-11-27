-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: banco_de_dados_catequese
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `catequese`
--

DROP TABLE IF EXISTS `catequese`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `catequese` (
  `id` int NOT NULL,
  `id_Volume` int DEFAULT NULL,
  `id_Catequista` int DEFAULT NULL,
  `Data_Inicio` datetime DEFAULT NULL,
  `Data_Fim` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_Volume` (`id_Volume`),
  KEY `catequese_FK` (`id_Catequista`),
  CONSTRAINT `catequese_FK` FOREIGN KEY (`id_Catequista`) REFERENCES `catequista` (`id`),
  CONSTRAINT `catequese_ibfk_1` FOREIGN KEY (`id_Volume`) REFERENCES `volume` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catequese`
--

LOCK TABLES `catequese` WRITE;
/*!40000 ALTER TABLE `catequese` DISABLE KEYS */;
INSERT INTO `catequese` VALUES (1,1,1,'2024-09-02 00:00:00','2025-12-09 00:00:00'),(2,1,1,'2024-12-08 00:00:00','2025-11-09 00:00:00'),(3,1,1,'2020-01-01 00:00:00','2020-01-01 00:00:00'),(4,1,1,'2022-11-24 00:00:00','2024-11-24 00:00:00');
/*!40000 ALTER TABLE `catequese` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catequisando`
--

DROP TABLE IF EXISTS `catequisando`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `catequisando` (
  `id` int NOT NULL,
  `id_endereco` int DEFAULT NULL,
  `id_matricula` int DEFAULT NULL,
  `Nome_da_Crianca` varchar(100) DEFAULT NULL,
  `Descricao` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `catequisando_FK` (`id_endereco`),
  KEY `catequisando_FK_1` (`id_matricula`),
  CONSTRAINT `catequisando_FK` FOREIGN KEY (`id_endereco`) REFERENCES `endereco` (`id`),
  CONSTRAINT `catequisando_FK_1` FOREIGN KEY (`id_matricula`) REFERENCES `matricula` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catequisando`
--

LOCK TABLES `catequisando` WRITE;
/*!40000 ALTER TABLE `catequisando` DISABLE KEYS */;
/*!40000 ALTER TABLE `catequisando` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catequista`
--

DROP TABLE IF EXISTS `catequista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `catequista` (
  `id` int NOT NULL,
  `id_endereco` int DEFAULT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `telefone` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_endereco` (`id_endereco`),
  CONSTRAINT `catequista_ibfk_1` FOREIGN KEY (`id_endereco`) REFERENCES `endereco` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catequista`
--

LOCK TABLES `catequista` WRITE;
/*!40000 ALTER TABLE `catequista` DISABLE KEYS */;
INSERT INTO `catequista` VALUES (1,NULL,'Teresa de Ávila','12345678901'),(2,NULL,'Fabio andrade de Assis','98765432109'),(3,NULL,'Teresa de Calcutá','45678901234'),(4,NULL,'Martinho Lutero','87654321098'),(5,NULL,'Hildegarda de Bingen','23456789012'),(6,NULL,'Dalai Lama','54321098765');
/*!40000 ALTER TABLE `catequista` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `endereco` (
  `id` int NOT NULL,
  `rua` varchar(100) DEFAULT NULL,
  `num_residencial` varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `jardim` varchar(100) DEFAULT NULL,
  `uf` varchar(100) DEFAULT NULL,
  `cep` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (1,'Rua das Violetas','327','Tóquio','Jardim Botânico de Singapura','TM',18400),(2,'Moonlight Alley','594','Roma','Jardins de Versalhes','RM',100000),(3,'Avenida dos Girassóis','812','Rio de Janeiro','Jardim Butchart','BR',10004),(4,'Allée des Étoiles','463','Sydney','Jardim Botânico do Rio de Janeiro','SD',10558);
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `matricula`
--

DROP TABLE IF EXISTS `matricula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `matricula` (
  `id` int NOT NULL,
  `Nome_da_Crianca` varchar(100) DEFAULT NULL,
  `Nome_do_Pai` varchar(100) DEFAULT NULL,
  `Telefone_do_Pai` int DEFAULT NULL,
  `Nome_da_Mae` varchar(100) DEFAULT NULL,
  `Telefone_da_Mae` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matricula`
--

LOCK TABLES `matricula` WRITE;
/*!40000 ALTER TABLE `matricula` DISABLE KEYS */;
/*!40000 ALTER TABLE `matricula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `turma`
--

DROP TABLE IF EXISTS `turma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `turma` (
  `id` int NOT NULL,
  `id_catequista` int DEFAULT NULL,
  `id_volume` int DEFAULT NULL,
  `Id_catequisando` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `turma_FK` (`id_catequista`),
  KEY `turma_FK_1` (`id_volume`),
  CONSTRAINT `turma_FK` FOREIGN KEY (`id_catequista`) REFERENCES `catequista` (`id`),
  CONSTRAINT `turma_FK_1` FOREIGN KEY (`id_volume`) REFERENCES `volume` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `turma`
--

LOCK TABLES `turma` WRITE;
/*!40000 ALTER TABLE `turma` DISABLE KEYS */;
/*!40000 ALTER TABLE `turma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `volume`
--

DROP TABLE IF EXISTS `volume`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `volume` (
  `id` int NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `volume`
--

LOCK TABLES `volume` WRITE;
/*!40000 ALTER TABLE `volume` DISABLE KEYS */;
INSERT INTO `volume` VALUES (1,'1°primeiro'),(2,'2°Segundo'),(3,'3°Terceiro'),(4,'4°Quarto'),(5,'5°Quinto'),(6,'Infância Missionária');
/*!40000 ALTER TABLE `volume` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'banco_de_dados_catequese'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-27 11:41:52
