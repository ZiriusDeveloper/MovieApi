Create database movie_collection;
use movie_collection;


DROP TABLE IF EXISTS `movie_details`;

CREATE TABLE `movie_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `year` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `poster` varchar(255) DEFAULT NULL,
   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
  



Insert into movie_details(id, title, year, type, poster ) values(101, 'Batman', '1994', 'movie', 'test');
Insert into movie_details(id, title, year, type, poster ) values(102, 'Transformer', '1997', 'movie', 'test');
Insert into movie_details(id, title, year, type, poster ) values(103, 'Spiderman', '2001', 'movie', 'test');
Insert into movie_details(id, title, year, type, poster ) values(104, 'Superman', '2012', 'movie', 'test');