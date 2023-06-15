-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: proyecto_obra
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `cameras`
--

DROP TABLE IF EXISTS `cameras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cameras` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_create` date DEFAULT NULL,
  `date_delete` date DEFAULT NULL,
  `date_update` date DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `ceiling` int DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `date_end` date DEFAULT NULL,
  `date_init` date DEFAULT NULL,
  `delay` varchar(255) DEFAULT NULL,
  `fallen_days` int DEFAULT NULL,
  `handy` int DEFAULT NULL,
  `mobile_crane` int DEFAULT NULL,
  `num_person_ceil` int DEFAULT NULL,
  `num_person_wall` int DEFAULT NULL,
  `num_wall` int DEFAULT NULL,
  `other_guilds` varchar(255) DEFAULT NULL,
  `panel_type_ceil` varchar(255) DEFAULT NULL,
  `panel_type_wall` varchar(255) DEFAULT NULL,
  `quality_work` int DEFAULT NULL,
  `reason` varchar(255) DEFAULT NULL,
  `scaffolding` int DEFAULT NULL,
  `scissors` int DEFAULT NULL,
  `stairs` int DEFAULT NULL,
  `stork` int DEFAULT NULL,
  `tower_crane` int DEFAULT NULL,
  `use_putty` varchar(255) DEFAULT NULL,
  `use_sealant` varchar(255) DEFAULT NULL,
  `winch` int DEFAULT NULL,
  `id_visit` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKh3rihw4m6rnh2f40n2jf6hyq` (`id_visit`),
  CONSTRAINT `FKh3rihw4m6rnh2f40n2jf6hyq` FOREIGN KEY (`id_visit`) REFERENCES `visits` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cameras`
--

LOCK TABLES `cameras` WRITE;
/*!40000 ALTER TABLE `cameras` DISABLE KEYS */;
INSERT INTO `cameras` VALUES (1,'2023-07-07','1900-01-01','1900-01-01','inactivo',21,'prueba2','2023-06-12','2023-06-12','no',15,3,3,4,4,21,'no','cu2512664','cf1232541',5,'viento',3,3,3,3,3,'no','no',3,1);
/*!40000 ALTER TABLE `cameras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conclusions`
--

DROP TABLE IF EXISTS `conclusions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conclusions` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_create` date DEFAULT NULL,
  `date_delete` date DEFAULT NULL,
  `date_update` date DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `current_progress` double DEFAULT NULL,
  `date_end` date DEFAULT NULL,
  `expected_progress` double DEFAULT NULL,
  `finished_work` varchar(255) DEFAULT NULL,
  `satisfaction` int DEFAULT NULL,
  `id_general` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKikxm4brukfx9ejxapep00by2l` (`id_general`),
  CONSTRAINT `FKikxm4brukfx9ejxapep00by2l` FOREIGN KEY (`id_general`) REFERENCES `generals` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conclusions`
--

LOCK TABLES `conclusions` WRITE;
/*!40000 ALTER TABLE `conclusions` DISABLE KEYS */;
INSERT INTO `conclusions` VALUES (1,'2023-07-07','1900-01-01','1900-01-01','activo','prueba11',93.36,'2023-12-05',91.25,'no',4,1);
/*!40000 ALTER TABLE `conclusions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generals`
--

DROP TABLE IF EXISTS `generals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generals` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_create` date DEFAULT NULL,
  `date_delete` date DEFAULT NULL,
  `date_update` date DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `adress` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `destination_use` varchar(255) DEFAULT NULL,
  `dni_cuit` varchar(255) DEFAULT NULL,
  `duration` int DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `scope` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_d5yq78ggn48ogl3rb4se2q4od` (`code`),
  UNIQUE KEY `UK_tpyawpqrr6fwmfvvbs8179x7y` (`dni_cuit`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generals`
--

LOCK TABLES `generals` WRITE;
/*!40000 ALTER TABLE `generals` DISABLE KEYS */;
INSERT INTO `generals` VALUES (1,'2023-07-07','1900-01-01','1900-01-01','activo','Los angeles 2321','P03131','prueba comment1','nave industrial','26-1025121-21',75,'Mendoza Plaza Shopping','inicia desde 1');
/*!40000 ALTER TABLE `generals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materials`
--

DROP TABLE IF EXISTS `materials`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materials` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_create` date DEFAULT NULL,
  `date_delete` date DEFAULT NULL,
  `date_update` date DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `cleaning_status` int DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `empty_container` varchar(255) DEFAULT NULL,
  `leftover_material` varchar(255) DEFAULT NULL,
  `material_transfer` int DEFAULT NULL,
  `organic_waste` varchar(255) DEFAULT NULL,
  `secure_storage` varchar(255) DEFAULT NULL,
  `storage_state` int DEFAULT NULL,
  `storage_time` time DEFAULT NULL,
  `id_general` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKlujxhlna5lrjv8gydfbs82xge` (`id_general`),
  CONSTRAINT `FKlujxhlna5lrjv8gydfbs82xge` FOREIGN KEY (`id_general`) REFERENCES `generals` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materials`
--

LOCK TABLES `materials` WRITE;
/*!40000 ALTER TABLE `materials` DISABLE KEYS */;
INSERT INTO `materials` VALUES (1,'2023-06-12','1900-06-06','1900-06-06','inactiva',5,'prueba123','no','no',3,'no','no',2,'14:21:45',1);
/*!40000 ALTER TABLE `materials` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mountings`
--

DROP TABLE IF EXISTS `mountings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mountings` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_create` date DEFAULT NULL,
  `date_delete` date DEFAULT NULL,
  `date_update` date DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `archit_stage` int DEFAULT NULL,
  `cameras_stage` int DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `deck` double DEFAULT NULL,
  `height` double DEFAULT NULL,
  `num_cameras` int DEFAULT NULL,
  `num_ceilings` int DEFAULT NULL,
  `num_wall` int DEFAULT NULL,
  `wall` double DEFAULT NULL,
  `id_general` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5o7mckh4tpgoe8c2kjosp9h0q` (`id_general`),
  CONSTRAINT `FK5o7mckh4tpgoe8c2kjosp9h0q` FOREIGN KEY (`id_general`) REFERENCES `generals` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mountings`
--

LOCK TABLES `mountings` WRITE;
/*!40000 ALTER TABLE `mountings` DISABLE KEYS */;
INSERT INTO `mountings` VALUES (1,'2023-12-12','1900-12-12','1900-12-12','inactivo',95,45,'prueba2',33.32,33.32,1,1,1,33.32,1);
/*!40000 ALTER TABLE `mountings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persons`
--

DROP TABLE IF EXISTS `persons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persons` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_create` date DEFAULT NULL,
  `date_delete` date DEFAULT NULL,
  `date_update` date DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `dni` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `record` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_t0tma5e5ec4leolu2gaqpc9v7` (`dni`),
  UNIQUE KEY `UK_17ris0c5yhhrj7llq1qid9hbb` (`record`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persons`
--

LOCK TABLES `persons` WRITE;
/*!40000 ALTER TABLE `persons` DISABLE KEYS */;
INSERT INTO `persons` VALUES (1,'2023-06-01','1900-01-01','2023-06-06','activo','Friolatina','31029020','Federico','Sabatini','adm','8652');
/*!40000 ALTER TABLE `persons` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profilings`
--

DROP TABLE IF EXISTS `profilings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profilings` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_create` date DEFAULT NULL,
  `date_delete` date DEFAULT NULL,
  `date_update` date DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `date_end` date DEFAULT NULL,
  `date_init` date DEFAULT NULL,
  `element_set` varchar(255) DEFAULT NULL,
  `kg_profiling` int DEFAULT NULL,
  `ml_profiling` int DEFAULT NULL,
  `ml_straps` int DEFAULT NULL,
  `num_person` int DEFAULT NULL,
  `result` int DEFAULT NULL,
  `use_sealant` varchar(255) DEFAULT NULL,
  `id_visit` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjg8vxw7eh9vq6lgrdr4x4inj2` (`id_visit`),
  CONSTRAINT `FKjg8vxw7eh9vq6lgrdr4x4inj2` FOREIGN KEY (`id_visit`) REFERENCES `visits` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profilings`
--

LOCK TABLES `profilings` WRITE;
/*!40000 ALTER TABLE `profilings` DISABLE KEYS */;
INSERT INTO `profilings` VALUES (1,'2023-07-07','1900-01-01','1900-01-01','inactivo','prueba2','2023-06-09','2023-06-07','iner',35,35,35,3,1,'no',1);
/*!40000 ALTER TABLE `profilings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_create` date DEFAULT NULL,
  `date_delete` date DEFAULT NULL,
  `date_update` date DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `id_user` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK40d4m5dluy4a79sk18r064avh` (`id_user`),
  CONSTRAINT `FK40d4m5dluy4a79sk18r064avh` FOREIGN KEY (`id_user`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'2023-07-07','1900-01-01','1900-01-01','activo','administrador',1);
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roofs`
--

DROP TABLE IF EXISTS `roofs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roofs` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_create` date DEFAULT NULL,
  `date_delete` date DEFAULT NULL,
  `date_update` date DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `date_end` date DEFAULT NULL,
  `date_init` date DEFAULT NULL,
  `delay` varchar(255) DEFAULT NULL,
  `fallen_days` int DEFAULT NULL,
  `handy` int DEFAULT NULL,
  `mobile_crane` int DEFAULT NULL,
  `num_deck` int DEFAULT NULL,
  `num_person` int DEFAULT NULL,
  `other_guilds` varchar(255) DEFAULT NULL,
  `panel_type` varchar(255) DEFAULT NULL,
  `quality_work` int DEFAULT NULL,
  `reason` varchar(255) DEFAULT NULL,
  `scaffolding` int DEFAULT NULL,
  `scissors` int DEFAULT NULL,
  `stairs` int DEFAULT NULL,
  `stork` int DEFAULT NULL,
  `tower_crane` int DEFAULT NULL,
  `use_sealant` varchar(255) DEFAULT NULL,
  `winch` int DEFAULT NULL,
  `id_visit` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1hc16pq2td7gea9pjp6hicqa6` (`id_visit`),
  CONSTRAINT `FK1hc16pq2td7gea9pjp6hicqa6` FOREIGN KEY (`id_visit`) REFERENCES `visits` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roofs`
--

LOCK TABLES `roofs` WRITE;
/*!40000 ALTER TABLE `roofs` DISABLE KEYS */;
INSERT INTO `roofs` VALUES (1,'2023-07-07','1900-01-01','1900-01-01','inactivo','prueba2','2023-06-12','2023-06-12','no',31,3,3,21,1,'no','CV125412',5,'viento',3,3,3,3,3,'no',3,1);
/*!40000 ALTER TABLE `roofs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `structures`
--

DROP TABLE IF EXISTS `structures`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `structures` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_create` date DEFAULT NULL,
  `date_delete` date DEFAULT NULL,
  `date_update` date DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `beams` int DEFAULT NULL,
  `budgeted` varchar(255) DEFAULT NULL,
  `columns` int DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `done` varchar(255) DEFAULT NULL,
  `straps` int DEFAULT NULL,
  `structure` varchar(255) DEFAULT NULL,
  `id_general` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKkwqhehemeepbj00u9piqj3r3e` (`id_general`),
  CONSTRAINT `FKkwqhehemeepbj00u9piqj3r3e` FOREIGN KEY (`id_general`) REFERENCES `generals` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `structures`
--

LOCK TABLES `structures` WRITE;
/*!40000 ALTER TABLE `structures` DISABLE KEYS */;
INSERT INTO `structures` VALUES (1,'2023-12-06','1900-12-06','1900-12-06','inactivo',4,'kgs',4,'prueba1s','nuevo',4,'nuevo',1);
/*!40000 ALTER TABLE `structures` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subjects`
--

DROP TABLE IF EXISTS `subjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subjects` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_create` date DEFAULT NULL,
  `date_delete` date DEFAULT NULL,
  `date_update` date DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `age_old` int DEFAULT NULL,
  `age_young` int DEFAULT NULL,
  `bathrooms` varchar(255) DEFAULT NULL,
  `clothes` int DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `epp` varchar(255) DEFAULT NULL,
  `footwear` varchar(255) DEFAULT NULL,
  `name_capataz` varchar(255) DEFAULT NULL,
  `name_contract` varchar(255) DEFAULT NULL,
  `num_arg` int DEFAULT NULL,
  `num_gang` int DEFAULT NULL,
  `num_guild` int DEFAULT NULL,
  `num_person` int DEFAULT NULL,
  `place_eat` varchar(255) DEFAULT NULL,
  `time_saturday_end` int DEFAULT NULL,
  `time_saturday_init` int DEFAULT NULL,
  `time_sunday_end` int DEFAULT NULL,
  `time_sunday_init` int DEFAULT NULL,
  `time_week_end` int DEFAULT NULL,
  `time_week_init` int DEFAULT NULL,
  `tools` varchar(255) DEFAULT NULL,
  `work_height` varchar(255) DEFAULT NULL,
  `id_visit` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKeswt2l5ukq50wbi0o88emc5p3` (`id_visit`),
  CONSTRAINT `FKeswt2l5ukq50wbi0o88emc5p3` FOREIGN KEY (`id_visit`) REFERENCES `visits` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subjects`
--

LOCK TABLES `subjects` WRITE;
/*!40000 ALTER TABLE `subjects` DISABLE KEYS */;
INSERT INTO `subjects` VALUES (1,'2023-07-07','1900-01-01','1900-01-01','inactivo',45,21,'si',2,'prueba2','si','no','Gimenez Maurinho','Raul Sandez',2,4,3,3,'si',15,7,12,7,15,7,'si','si',1);
/*!40000 ALTER TABLE `subjects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_create` date DEFAULT NULL,
  `date_delete` date DEFAULT NULL,
  `date_update` date DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `id_person` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKt1ck97adua0pbtboqs1uy4s56` (`id_person`),
  CONSTRAINT `FKt1ck97adua0pbtboqs1uy4s56` FOREIGN KEY (`id_person`) REFERENCES `persons` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'2023-06-06','1900-01-01','1900-01-01','activo','fsabatini','password',1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visits`
--

DROP TABLE IF EXISTS `visits`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `visits` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_create` date DEFAULT NULL,
  `date_delete` date DEFAULT NULL,
  `date_update` date DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `date_visit` date DEFAULT NULL,
  `nro_visit` int DEFAULT NULL,
  `id_general` bigint DEFAULT NULL,
  `id_person` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKmny3wl94xbhn0bda48bdo108q` (`id_general`),
  KEY `FK1qom2txbht2wjl02a1jlg6q71` (`id_person`),
  CONSTRAINT `FK1qom2txbht2wjl02a1jlg6q71` FOREIGN KEY (`id_person`) REFERENCES `persons` (`id`),
  CONSTRAINT `FKmny3wl94xbhn0bda48bdo108q` FOREIGN KEY (`id_general`) REFERENCES `generals` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visits`
--

LOCK TABLES `visits` WRITE;
/*!40000 ALTER TABLE `visits` DISABLE KEYS */;
INSERT INTO `visits` VALUES (1,'2023-07-07','1900-01-01','1900-01-01','activo','2023-07-07',1,1,1);
/*!40000 ALTER TABLE `visits` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `walls`
--

DROP TABLE IF EXISTS `walls`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `walls` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_create` date DEFAULT NULL,
  `date_delete` date DEFAULT NULL,
  `date_update` date DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `date_end` date DEFAULT NULL,
  `date_init` date DEFAULT NULL,
  `delay` varchar(255) DEFAULT NULL,
  `fallen_days` int DEFAULT NULL,
  `handy` int DEFAULT NULL,
  `mobile_crane` int DEFAULT NULL,
  `num_person` int DEFAULT NULL,
  `num_wall` int DEFAULT NULL,
  `other_guilds` varchar(255) DEFAULT NULL,
  `panel_type` varchar(255) DEFAULT NULL,
  `quality_work` int DEFAULT NULL,
  `reason` varchar(255) DEFAULT NULL,
  `scaffolding` int DEFAULT NULL,
  `scissors` int DEFAULT NULL,
  `stairs` int DEFAULT NULL,
  `stork` int DEFAULT NULL,
  `tower_crane` int DEFAULT NULL,
  `use_sealant` varchar(255) DEFAULT NULL,
  `winch` int DEFAULT NULL,
  `id_visit` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8jix9bqo2kf3hebk08adkaddr` (`id_visit`),
  CONSTRAINT `FK8jix9bqo2kf3hebk08adkaddr` FOREIGN KEY (`id_visit`) REFERENCES `visits` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `walls`
--

LOCK TABLES `walls` WRITE;
/*!40000 ALTER TABLE `walls` DISABLE KEYS */;
INSERT INTO `walls` VALUES (1,'2023-07-07','1900-01-01','1900-01-01','inactivo','prueba2','2023-06-12','2023-06-12','no',31,3,3,1,21,'no','CV125412',5,'viento',3,3,3,3,3,'no',3,1);
/*!40000 ALTER TABLE `walls` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-15 11:17:16
