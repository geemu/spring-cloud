package me.geemu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author: 陈方明
 * Email: cfmmail@sina.com
 * Date: 2017/9/14 18:07
 * Description:
 */
@Component
public class CommonDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public <T> List<T> find(Query query, Class<T> t) {
        return mongoTemplate.find(query, t);
    }

    public long count(Query query, Class<?> t) {
        return mongoTemplate.count(query, t);
    }

}
