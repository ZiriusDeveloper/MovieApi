# mysql script
CREATE DATABASE moviedb;

USE moviedb;

CREATE TABLE world_languages ( id NUMERIC, name VARCHAR(200) , CONSTRAINT world_languages_id_pk PRIMARY KEY (id));

CREATE TABLE world_countries ( id NUMERIC , name VARCHAR(200) , CONSTRAINT world_countries_id_pk PRIMARY KEY (id) );

CREATE TABLE movies ( id NUMERIC, title VARCHAR(200), year NUMERIC, rated VARCHAR(10), released DATE, runtime VARCHAR(10), plot BLOB, language NUMERIC, country NUMERIC,
 metascore NUMERIC, votes NUMERIC, type NUMERIC, dvd_release_date DATE, website VARCHAR(200),
 CONSTRAINT movies_id_pk PRIMARY KEY (id),
 CONSTRAINT language_fk FOREIGN KEY(language) REFERENCES world_languages(id),
 CONSTRAINT country_fk FOREIGN KEY(country) REFERENCES world_countries(id));

CREATE TABLE genres ( id NUMERIC, described VARCHAR(200) , CONSTRAINT genres_id_pk PRIMARY KEY (id) );

CREATE TABLE movie_genres (movie_id NUMERIC, genre_id NUMERIC, CONSTRAINT movie_id_1_fk FOREIGN KEY(movie_id) REFERENCES movies(id),
                           CONSTRAINT genre_id_1_fk FOREIGN KEY(genre_id) REFERENCES genres(id),
                           CONSTRAINT movie_id_genre_id_pk PRIMARY KEY (movie_id,genre_id));

CREATE TABLE directors ( id NUMERIC, name VARCHAR(200) , CONSTRAINT directors_id_pk PRIMARY KEY (id) );

CREATE TABLE movie_directors (movie_id NUMERIC, director_id NUMERIC, CONSTRAINT movie_id_2_fk FOREIGN KEY(movie_id) REFERENCES movies(id),
                           CONSTRAINT director_id_1_fk FOREIGN KEY(director_id) REFERENCES directors(id),
                           CONSTRAINT movie_id_director_id_pk PRIMARY KEY (movie_id,director_id));


CREATE TABLE writers ( id NUMERIC, name VARCHAR(200) , CONSTRAINT writers_id_pk PRIMARY KEY (id) );

CREATE TABLE movie_writers (movie_id NUMERIC, writer_id NUMERIC, CONSTRAINT movie_id_3_fk FOREIGN KEY(movie_id) REFERENCES movies(id),
                            CONSTRAINT write_id_1_fk FOREIGN KEY(writer_id) REFERENCES writers(id),
                            CONSTRAINT movie_id_write_id_pk PRIMARY KEY (movie_id,writer_id));

CREATE TABLE actors ( id NUMERIC, name VARCHAR(200) , CONSTRAINT actors_id_pk PRIMARY KEY (id) );

CREATE TABLE movie_actors (movie_id NUMERIC, actor_id NUMERIC, CONSTRAINT movie_id_4_fk FOREIGN KEY(movie_id) REFERENCES movies(id),
                            CONSTRAINT actor_id_1_fk FOREIGN KEY(actor_id) REFERENCES actors(id),
                            CONSTRAINT movie_id_actor_id_uk PRIMARY KEY (movie_id,actor_id));

CREATE TABLE movie_awards ( id NUMERIC, movie_id NUMERIC, described VARCHAR(200) , won NUMERIC, nominated NUMERIC , CONSTRAINT movie_awards_id PRIMARY KEY (id));

CREATE TABLE movie_ratings ( id NUMERIC, movie_id NUMERIC, source VARCHAR(200) , value NUMERIC , total NUMERIC , CONSTRAINT movie_ratings_id PRIMARY KEY (id));
