package com.innov.order.service;

import com.innov.order.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseServiceImpl implements BaseService {

    @Autowired
    private BaseDao baseDao ;

    @Override
    public List findAll() {
       return baseDao.findAll() ;
    }

    @Override
    public List findOrderById(String id) {
        return baseDao.findOrderById(id);
    }
}
