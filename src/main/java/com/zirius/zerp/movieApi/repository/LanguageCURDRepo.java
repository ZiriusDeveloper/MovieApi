package com.zirius.zerp.movieApi.repository;

import com.zirius.zerp.tables.daos.WorldLanguagesDao;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LanguageCURDRepo extends WorldLanguagesDao {

    @Autowired
    public LanguageCURDRepo(DSLContext jooq) {
        super(jooq.configuration());
    }

}
