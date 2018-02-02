package com.innov.order.dao;

import java.util.List;

public interface BaseDao {

    public List findAll() ;

    public List findOrderById(String id) ;
}
