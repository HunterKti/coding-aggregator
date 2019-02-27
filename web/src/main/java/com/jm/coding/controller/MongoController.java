package com.jm.coding.controller;

import com.jm.coding.Col;
import com.jm.coding.Goods;
import com.jm.coding.dao.MongoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mongo")
public class MongoController {

    @Autowired
    MongoDao mongoDao;

    @RequestMapping("/test")
    public Col queryByTitle(){
        return mongoDao.queryByTitle("mongoDB");
    }

    @RequestMapping("/goods")
    public Goods queryGoodsById(){
        return mongoDao.queryById(1);
    }
}
