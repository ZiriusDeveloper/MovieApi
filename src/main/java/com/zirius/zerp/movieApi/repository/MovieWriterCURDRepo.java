package com.zirius.zerp.movieApi.repository;

import com.zirius.zerp.tables.daos.MovieWritersDao;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieWriterCURDRepo extends MovieWritersDao {

    @Autowired
    public MovieWriterCURDRepo(DSLContext jooq) {
        super(jooq.configuration());
    }

}
