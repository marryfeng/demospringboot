package com.example.demo.controller;

import com.example.demo.dao.GirlRep;
import com.example.demo.entity.Girl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by fengli on 2017/9/6.
 */
@RestController
public class GirlContrller {

    @Autowired
    private GirlRep  girlRep;

    private static final Logger logger= LoggerFactory.getLogger(GirlContrller.class);

    @RequestMapping(value={"/getGirls"},method = RequestMethod.GET)
    //alter+enter是导入包
    public List<Girl> getGirls(){
       return  girlRep.findAll();

    }

    @RequestMapping(value={"/insertGirls"},method = RequestMethod.GET)
    public void insertGirls(){
        logger.info("向数据库中添加内容");
        Girl girl=new Girl();
        girl.setGirlname("小红");
        girl.setAge(10);
        girlRep.save(girl);
    }
}
