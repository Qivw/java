package com.qi.JDBC;

import org.junit.Test;


public class JDBC_crudTest {


    JDBC_crud jdbc_crud = new JDBC_crud();

    @Test
    public void jdbcQuery() {

        jdbc_crud.jdbcQuery();
    }

    @Test
    public void jdbcInsert() {
        jdbc_crud.jdbcInsert();
    }
}