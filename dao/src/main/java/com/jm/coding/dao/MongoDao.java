package com.jm.coding.dao;

import com.jm.coding.Col;
import com.jm.coding.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class MongoDao {

    @Autowired
    MongoTemplate mongoTemplate;

    public Col queryByTitle(String title){
        Query query = new Query(Criteria.where("title").is(title));
        Col col = mongoTemplate.findOne(query, Col.class);
        return col;
    }

    public Goods queryById(Integer id){
        Query query = new Query(Criteria.where("id").is(id));
        Goods goods = mongoTemplate.findOne(query,Goods.class);
        System.out.println("goods="+goods);
        return goods;
    }
}
