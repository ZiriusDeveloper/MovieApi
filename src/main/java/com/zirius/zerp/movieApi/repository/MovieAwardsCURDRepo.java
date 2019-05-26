package com.zirius.zerp.movieApi.repository;

import com.zirius.zerp.tables.daos.MovieAwardsDao;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieAwardsCURDRepo extends MovieAwardsDao {

    @Autowired
    public MovieAwardsCURDRepo(DSLContext jooq) {
        super(jooq.configuration());
    }

}
