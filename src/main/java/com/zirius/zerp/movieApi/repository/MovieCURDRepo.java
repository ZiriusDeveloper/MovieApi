package com.zirius.zerp.movieApi.repository;

import com.zirius.zerp.movieApi.model.dto.MovieDto;
import com.zirius.zerp.tables.daos.MoviesDao;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieCURDRepo extends MoviesDao {

    @Autowired
    public MovieCURDRepo(DSLContext jooq) {
        super(jooq.configuration());
    }

}
