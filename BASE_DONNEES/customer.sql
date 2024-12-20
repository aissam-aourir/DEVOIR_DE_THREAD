

CREATE TABLE customers (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES customers WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO customers VALUES (1,'aissam','aissamaourir3@gmail.test'),(2,'aissam1','aissamaourir4@gmail.test'),(3,'aissam2','aissamaourir5@mail.test');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

