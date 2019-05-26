package com.zirius.zerp.movieApi.repository;

import com.zirius.zerp.tables.daos.DirectorsDao;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DirestorsCURDRepo extends DirectorsDao {

    @Autowired
    public DirestorsCURDRepo(DSLContext jooq) {
        super(jooq.configuration());
    }

}
