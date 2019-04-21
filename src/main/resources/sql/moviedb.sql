CREATE TABLE `movies` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `year` int(11) DEFAULT NULL,
  `run_time_minutes` int(11) DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  `plot` varchar(1024) DEFAULT NULL,
  `language` varchar(45) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;


--Creating triggers for Create and Update date 
CREATE TRIGGER `movies_AINS` AFTER INSERT ON `movies` FOR EACH ROW
begin
UPDATE movies SET created_time = NOW();
end

CREATE TRIGGER `movies_AINS` AFTER INSERT ON `movies` FOR EACH ROW
begin
UPDATE movies SET updated_time = NOW();
end

-------------------------------------------------------------------------------------

CREATE TABLE `ratings` (
  `id` int(11) NOT NULL,
  `source` varchar(45) DEFAULT NULL,
  `value` varchar(10) DEFAULT NULL,
  `movie_id` int(11) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  `is_active` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_ratings_1_idx` (`movie_id`),
  CONSTRAINT `fk_ratings_1` FOREIGN KEY (`movie_id`) REFERENCES `movies` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--Creating triggers for Create and Update date 
CREATE TRIGGER `ratings_AINS` AFTER INSERT ON `ratings` FOR EACH ROW
begin
UPDATE ratings SET created_time = NOW();
end

CREATE TRIGGER `ratings_AINS` AFTER INSERT ON `ratings` FOR EACH ROW
begin
UPDATE ratings SET updated_time = NOW();
end

---------------------------------------------------------------------------------------------

CREATE TABLE `roles` (
  `id` int(11) NOT NULL,
  `worked_as` varchar(45) DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--Creating triggers for Create and Update date 
CREATE TRIGGER `roles_AINS` AFTER INSERT ON `roles` FOR EACH ROW
begin
UPDATE roles SET created_time = NOW();
end

CREATE TRIGGER `roles_AINS` AFTER INSERT ON `roles` FOR EACH ROW
begin
UPDATE roles SET updated_time = NOW();
end
--------------------------------------------------------------------------------------------------

CREATE TABLE `artists` (
  `id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `role` int(11) NOT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  `is_active` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_artists_1_idx` (`role`),
  CONSTRAINT `fk_artists_1` FOREIGN KEY (`role`) REFERENCES `roles` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--Creating triggers for Create and Update date 
CREATE TRIGGER `artists_AINS` AFTER INSERT ON `artists` FOR EACH ROW
begin
UPDATE artists SET created_time = NOW();
end

CREATE TRIGGER `artists_AINS` AFTER INSERT ON `artists` FOR EACH ROW
begin
UPDATE artists SET updated_time = NOW();
end

----------------------------------------------------------------------------------------------


CREATE TABLE `movies_artists` (
  `id` int(11) NOT NULL,
  `movie_id` int(11) DEFAULT NULL,
  `artist_id` int(11) DEFAULT NULL,
  `created_time` varchar(45) DEFAULT NULL,
  `updated_time` varchar(45) DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_movies_artists_artist_id_idx` (`artist_id`),
  KEY `fk_movies_artists_movies_id_idx` (`movie_id`),
  CONSTRAINT `fk_movies_artists_artist_id` FOREIGN KEY (`artist_id`) REFERENCES `artists` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_movies_artists_movies_id` FOREIGN KEY (`movie_id`) REFERENCES `movies` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--Creating triggers for Create and Update date 
CREATE TRIGGER `movies_artists_AINS` AFTER INSERT ON `movies_artists` FOR EACH ROW
begin
UPDATE movies_artists SET created_time = NOW();
end


CREATE TRIGGER `movies_artists_AINS` AFTER INSERT ON `movies_artists` FOR EACH ROW
begin
UPDATE movies_artists SET updated_time = NOW();
end
