package com.zirius.zerp.movieApi.repository;

import com.zirius.zerp.tables.daos.MovieActorsDao;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieActorCURDRepo extends MovieActorsDao {

    @Autowired
    public MovieActorCURDRepo(DSLContext jooq) {
        super(jooq.configuration());
    }

}
