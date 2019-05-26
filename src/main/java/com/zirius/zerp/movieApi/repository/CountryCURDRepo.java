package com.zirius.zerp.movieApi.repository;

import com.zirius.zerp.tables.daos.WorldCountriesDao;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CountryCURDRepo extends WorldCountriesDao {

    @Autowired
    public CountryCURDRepo(DSLContext jooq) {
        super(jooq.configuration());
    }

}
