package com.zirius.zerp.movieApi.repository;

import com.zirius.zerp.tables.daos.MovieGenresDao;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieGenresCURDRepo extends MovieGenresDao {

    @Autowired
    public MovieGenresCURDRepo(DSLContext jooq) {
        super(jooq.configuration());
    }

}
