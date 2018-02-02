package com.innov.order.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaseDaoImpl implements BaseDao{

    @Autowired
    private JdbcTemplate jdbcTemplate ;

    @Override
    public List findAll() {
        return jdbcTemplate.queryForList("SELECT * FROM  ORDERS ") ;
    }
}
