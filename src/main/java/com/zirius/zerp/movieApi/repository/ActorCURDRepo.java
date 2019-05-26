package com.zirius.zerp.movieApi.repository;

import com.zirius.zerp.tables.daos.ActorsDao;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ActorCURDRepo extends ActorsDao {

    @Autowired
    public ActorCURDRepo(DSLContext jooq) {
        super(jooq.configuration());
    }

}
