package com.zirius.zerp.movieApi.repository;

import com.zirius.zerp.tables.daos.MovieRatingsDao;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieRatingsCURDRepo extends MovieRatingsDao {

    @Autowired
    public MovieRatingsCURDRepo(DSLContext jooq) {
        super(jooq.configuration());
    }

}
