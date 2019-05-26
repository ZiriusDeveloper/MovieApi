package com.zirius.zerp.movieApi.repository;

import com.zirius.zerp.tables.daos.MovieDirectorsDao;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDirectorsCURDRepo extends MovieDirectorsDao {

    @Autowired
    public MovieDirectorsCURDRepo(DSLContext jooq) {
        super(jooq.configuration());
    }

}
