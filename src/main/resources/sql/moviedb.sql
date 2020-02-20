Create database MOVIES;
use MOVIES;
drop table MOVIE_DETAILS;
CREATE TABLE MOVIE_DETAILS (
  id INT(6) NOT NULL,
  movie_name VARCHAR(20) ,
  release_year VARCHAR(20) ,
  movie_type VARCHAR(20) ,
  rating VARCHAR(10)
);

insert into MOVIE_DETAILS (id,movie_name,release_year,movie_type,rating) values (001,'Saw1','2009','Movie','2');
insert into MOVIE_DETAILS (id,movie_name,release_year,movie_type,rating) values (002,'Saw2','2010','Serial','5');
select * from MOVIE_DETAILS;



