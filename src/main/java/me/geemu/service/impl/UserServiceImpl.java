package me.geemu.service.impl;

import me.geemu.domain.request.NewUser;
import me.geemu.persistence.model.User;
import me.geemu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: 陈方明
 * Email: cfmmail@sina.com
 * Date: 2017/9/14 18:10
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 根据姓查找用户
     *
     * @param firstName
     * @return
     */
    @Override
    public List<User> findByFirstName(String firstName) {
        Criteria criteria = new Criteria();
        criteria.and("firstName").is(firstName);
        Query query = new Query(criteria);
        return mongoTemplate.find(query, User.class);
    }

    /**
     * 根据用户名查找用户
     *
     * @param account
     * @return
     */
    @Override
    public User findByAccount(String account) {
        Criteria criteria = new Criteria();
        criteria.and("account").is(account);
        Query query = new Query(criteria);
        return mongoTemplate.findOne(query, User.class);
    }

    /**
     * 创建一个用户
     *
     * @param newUser
     * @return
     */
    @Override
    public String createOneUser(NewUser newUser) {
        if (findByAccount(newUser.getAccount()) != null) {
            return "用户名已存在";
        }
        User user = new User();
        user.setAccount(newUser.getAccount());
        user.setPassword(newUser.getPassword());
        mongoTemplate.insert(user);
        return user.getId();
    }
}
