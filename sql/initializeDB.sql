-- MySQL dump 10.13  Distrib 8.0.27, for macos11 (x86_64)
--
-- Host: 127.0.0.1    Database: charity
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `campaign`
--

DROP TABLE IF EXISTS `campaign`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `campaign` (
  `id` int NOT NULL AUTO_INCREMENT,
  `charity_id` int NOT NULL,
  `name` varchar(50) NOT NULL,
  `start_date` date NOT NULL,
  `target_region_id` int DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `charity_id` (`charity_id`),
  CONSTRAINT `campaign_ibfk_1` FOREIGN KEY (`charity_id`) REFERENCES `charity_organization` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `campaign`
--

LOCK TABLES `campaign` WRITE;
/*!40000 ALTER TABLE `campaign` DISABLE KEYS */;
INSERT INTO `campaign` VALUES (1,6,'Hunger & Food Insecurity Laos','2021-09-23',3,'2021-12-30'),(2,6,'Hunger & Food Insecurity Indiana','2022-01-01',4,'2022-03-01'),(3,7,'Clean Earth Mumbai','2022-04-11',2,NULL),(4,8,'Hunger & Food Insecurity Chicago November','2021-11-01',1,'2021-11-30'),(5,7,'Clean Earth LA','2021-10-28',5,NULL);
/*!40000 ALTER TABLE `campaign` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `campaign_target_region`
--

DROP TABLE IF EXISTS `campaign_target_region`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `campaign_target_region` (
  `target_region_id` int NOT NULL,
  `campaign_id` int NOT NULL,
  PRIMARY KEY (`target_region_id`,`campaign_id`),
  KEY `campaign_id` (`campaign_id`),
  CONSTRAINT `campaign_target_region_ibfk_1` FOREIGN KEY (`target_region_id`) REFERENCES `target_region` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `campaign_target_region_ibfk_2` FOREIGN KEY (`campaign_id`) REFERENCES `campaign` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `campaign_target_region`
--

LOCK TABLES `campaign_target_region` WRITE;
/*!40000 ALTER TABLE `campaign_target_region` DISABLE KEYS */;
INSERT INTO `campaign_target_region` VALUES (3,1),(4,2),(2,3),(1,4),(5,5);
/*!40000 ALTER TABLE `campaign_target_region` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `charity_organization`
--

DROP TABLE IF EXISTS `charity_organization`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `charity_organization` (
  `id` int NOT NULL,
  `name` varchar(20) NOT NULL,
  `cause` varchar(40) NOT NULL,
  `address` varchar(30) NOT NULL,
  `target_region_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`,`name`,`cause`,`address`),
  KEY `target_region_id` (`target_region_id`),
  CONSTRAINT `charity_organization_ibfk_1` FOREIGN KEY (`id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `charity_organization_ibfk_2` FOREIGN KEY (`target_region_id`) REFERENCES `campaign_target_region` (`target_region_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `charity_organization`
--

LOCK TABLES `charity_organization` WRITE;
/*!40000 ALTER TABLE `charity_organization` DISABLE KEYS */;
INSERT INTO `charity_organization` VALUES (6,'Charity1','Hunger & Food Insecurity','Address1, Chicago',1),(7,'Charity2','Clean Earth','Address2, Chicago',1),(8,'Charity3','Hunger & Food Insecurity','Address3, Chicago',1),(9,'Charity4','Human Rights','Address4, Mumbai',2),(10,'Charity5','People Rights','Address5, Mumbai',2);
/*!40000 ALTER TABLE `charity_organization` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donation`
--

DROP TABLE IF EXISTS `donation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donation` (
  `id` int NOT NULL,
  `donor_name` varchar(20) NOT NULL,
  `charity_id` int DEFAULT NULL,
  `donation_amount` double NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `charity_id` (`charity_id`),
  CONSTRAINT `donation_ibfk_1` FOREIGN KEY (`id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `donation_ibfk_2` FOREIGN KEY (`charity_id`) REFERENCES `charity_organization` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donation`
--

LOCK TABLES `donation` WRITE;
/*!40000 ALTER TABLE `donation` DISABLE KEYS */;
INSERT INTO `donation` VALUES (1,'Shaun Kollannur',6,200),(2,'elonmusk',6,200069),(3,'jeffbezos',8,200000),(4,'google',7,200001),(5,'netflix',7,200000);
/*!40000 ALTER TABLE `donation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entity1`
--

DROP TABLE IF EXISTS `entity1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entity1` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entity1`
--

LOCK TABLES `entity1` WRITE;
/*!40000 ALTER TABLE `entity1` DISABLE KEYS */;
/*!40000 ALTER TABLE `entity1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `target_region`
--

DROP TABLE IF EXISTS `target_region`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `target_region` (
  `id` int NOT NULL AUTO_INCREMENT,
  `population` int NOT NULL,
  `region_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`,`region_name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `target_region`
--

LOCK TABLES `target_region` WRITE;
/*!40000 ALTER TABLE `target_region` DISABLE KEYS */;
INSERT INTO `target_region` VALUES (1,2746388,'Chicago'),(2,12478447,'Mumbai'),(3,7123205,'Laos'),(4,6785528,'Indiana'),(5,3898747,'Los Angeles');
/*!40000 ALTER TABLE `target_region` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `task`
--

DROP TABLE IF EXISTS `task`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `task` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `campaign_id` int DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `number_of_participants` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `campaign_id` (`campaign_id`),
  CONSTRAINT `task_ibfk_1` FOREIGN KEY (`campaign_id`) REFERENCES `campaign` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `task`
--

LOCK TABLES `task` WRITE;
/*!40000 ALTER TABLE `task` DISABLE KEYS */;
INSERT INTO `task` VALUES (1,'Marketing for Hunger & Food Insecurity Laos',1,'Marketing for Hunger & Food Insecurity Laos Event/Donation Drive',2),(2,'Event Management for Hunger & Food Insecurity Laos',1,'Event Management  Hunger & Food Insecurity Laos Event/Donation Drive',1),(3,'Marketing for Clean Earth Mumbai',3,'Marketing for Clean Earth Mumbai',2),(4,'Event Management for Clean Earth Mumbai',3,'Event Management for Clean Earth Mumbai',1),(5,'Marketing for Clean Earth LA',5,'Marketing for Clean Earth LA Event/Donation Drive',2);
/*!40000 ALTER TABLE `task` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `task_status`
--

DROP TABLE IF EXISTS `task_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `task_status` (
  `id` int NOT NULL,
  `status` varchar(10) NOT NULL,
  `remark` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`,`remark`),
  CONSTRAINT `task_status_ibfk_1` FOREIGN KEY (`id`) REFERENCES `task` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `task_status`
--

LOCK TABLES `task_status` WRITE;
/*!40000 ALTER TABLE `task_status` DISABLE KEYS */;
INSERT INTO `task_status` VALUES (1,'COMPLETE','SUCCESS'),(2,'ONGOING','ONGOING'),(3,'ONGOING','DELAYED'),(4,'ONGOING','DELAYED');
/*!40000 ALTER TABLE `task_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  `user_type` char(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`,`username`,`password`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'shauniop','password@123',' shauniop@email.com','D'),(2,'elonmusk','spacex@123',' elonmusk@email.com','D'),(3,'jeffbezos','amazon@123',' jeffbezos@email.com','D'),(4,'google','google@123',' google@email.com','D'),(5,'netflix','netflix@123',' netflix@email.com','D'),(6,'charity1','charity1@123',' charity1@email.com','C'),(7,'charity2','charity2@123',' charity2@email.com','C'),(8,'charity3','charity3@123',' charity3@email.com','C'),(9,'charity4','charity4@123',' charity4@email.com','C'),(10,'charity5','charity5@123','charity5@email.com','C'),(11,'volunteer1','volunteer1@123','volunteer1@email.com','V'),(12,'volunteer2','volunteer2@123','volunteer2@email.com','V'),(13,'volunteer3','volunteer3@123','volunteer3@email.com','V'),(14,'volunteer4','volunteer4@123','volunteer4@email.com','V'),(15,'volunteer5','volunteer5@123','volunteer5@email.com','V'),(16,'volunteer6','volunteer6@123','volunteer6@email.com','V'),(17,'volunteer7','volunteer7@123','volunteer7@email.com','V');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `volunteer`
--

DROP TABLE IF EXISTS `volunteer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `volunteer` (
  `id` int NOT NULL,
  `name` varchar(20) NOT NULL,
  `task_id` int NOT NULL,
  `level` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `task_id` (`task_id`),
  CONSTRAINT `volunteer_ibfk_1` FOREIGN KEY (`id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `volunteer_ibfk_2` FOREIGN KEY (`task_id`) REFERENCES `task` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `volunteer`
--

LOCK TABLES `volunteer` WRITE;
/*!40000 ALTER TABLE `volunteer` DISABLE KEYS */;
INSERT INTO `volunteer` VALUES (11,'Volunteer1',1,'Level 1'),(12,'Volunteer2',2,'Level 1'),(13,'Volunteer3',3,'Level 1'),(14,'Volunteer4',4,'Level 1'),(15,'Volunteer5',5,'Manager'),(16,'Volunteer6',1,'Manager'),(17,'Volunteer7',5,'Level 1');
/*!40000 ALTER TABLE `volunteer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-11 20:03:57
