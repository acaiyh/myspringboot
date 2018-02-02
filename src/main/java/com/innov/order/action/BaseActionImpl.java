package com.innov.order.action;

import com.innov.order.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BaseActionImpl implements BaseAction {

    @Autowired
    private BaseService baseService ;

    @Override
    @RequestMapping(value = "/order",method = RequestMethod.GET)
    public List findAll() {
        System.out.println("success") ;
        return baseService.findAll() ;
    }
}
