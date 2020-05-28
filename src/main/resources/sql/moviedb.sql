DROP SCHEMA IF EXISTS `MovieApplication`;

CREATE SCHEMA `MovieApplication`;

use `MovieApplication`;


DROP TABLE IF EXISTS `Movie_Details`;

CREATE TABLE `Movie_Details` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Title` nvarchar(1000) DEFAULT NULL,
  `Year` varchar(1000) DEFAULT NULL,
  `Rated` varchar(1000) DEFAULT NULL,
  `Released` varchar(1000) DEFAULT NULL,
  `Runtime` varchar(1000) DEFAULT NULL,
  `Genre` varchar(1000) DEFAULT NULL,
  `Director` varchar(1000) DEFAULT NULL,
  `Writer` varchar(1000) DEFAULT NULL,
  `Actors` varchar(1000) DEFAULT NULL,
  `Plot` varchar(1000) DEFAULT NULL,
  `Language` varchar(1000) DEFAULT NULL,
  `Country` varchar(1000) DEFAULT NULL,
  `Awards` varchar(1000) DEFAULT NULL,
  `Poster` varchar(1000) DEFAULT NULL,
  `Metascore` varchar(100) DEFAULT NULL,
  `imdbRating` varchar(100) DEFAULT NULL,
  `imdbVotes` varchar(100) DEFAULT NULL,
  `imdbID` varchar(100) DEFAULT NULL,
  `Type` varchar(100) DEFAULT NULL,
  `DVD` varchar(100) DEFAULT NULL,
  `BoxOffice` varchar(100) DEFAULT NULL,
  `Production` varchar(100) DEFAULT NULL,
  `Website` varchar(100) DEFAULT NULL,
  `Response` varchar(100) DEFAULT NULL,

  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


