
DROP TABLE IF EXISTS orders;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE orders (
  `idOrder` int NOT NULL AUTO_INCREMENT,
  `dateOrder` varchar(255) NOT NULL,
  `amount` float NOT NULL,
  `customerId` int NOT NULL,
  PRIMARY KEY (`idOrder`)
) ;

LOCK TABLES orders WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO orders VALUES (202,'2025-1-1',250.75,1),(102,'hhhhhhh',180.5,2),(103,'2025-1-2',-320,3);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;
