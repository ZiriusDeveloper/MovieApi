package com.zirius.zerp.movieApi.repository;

import com.zirius.zerp.tables.daos.GenresDao;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GenresCURDRepo extends GenresDao {

    @Autowired
    public GenresCURDRepo(DSLContext jooq) {
        super(jooq.configuration());
    }

}
