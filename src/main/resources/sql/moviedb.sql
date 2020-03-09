
Create database movie_collection;
use movie_collection;

DROP TABLE IF EXISTS `movie_details`;

CREATE TABLE `movie_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `country` varchar(255) DEFAULT NULL,
  `director` varchar(255) DEFAULT NULL,
  `genre` varchar(255) DEFAULT NULL,
  `language` varchar(255) DEFAULT NULL,
  `rated` varchar(255) DEFAULT NULL,
  `runtime` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `year` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniqueMovie` (`title`,`year`,`type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `movie_details` WRITE;
/*!40000 ALTER TABLE `movie_details` DISABLE KEYS */;

INSERT INTO `movie_details` (`id`, `country`, `director`, `genre`, `language`, `rated`, `runtime`, `title`, `type`, `year`)
VALUES
	(1,'USA, UK','Tim Burton','Action, Adventure','English, French, Spanish','PG-13','130 min','Batman','movie','1989'),
	(2,'USA, UK, Canada, Switzerland','Richard Donner','Action, Adventure, Drama, Sci-Fi','English','PG','150 min','Superman','movie','1978');

/*!40000 ALTER TABLE `movie_details` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `username` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;

INSERT INTO `user` (`id`, `name`, `password`, `username`)
VALUES
	(2,'administrator','$2a$10$HqTTNhFOgjfCrNdh5dPjx.yusRejP.tvJCB4gzwCbqyTCNsgfYtqS','admin');

/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;




