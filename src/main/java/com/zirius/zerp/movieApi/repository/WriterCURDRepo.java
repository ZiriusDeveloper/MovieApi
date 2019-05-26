package com.zirius.zerp.movieApi.repository;

import com.zirius.zerp.tables.daos.WritersDao;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WriterCURDRepo extends WritersDao {

    @Autowired
    public WriterCURDRepo(DSLContext jooq) {
        super(jooq.configuration());
    }

}
