package me.geemu.service.impl;

import me.geemu.persistence.dao.CommonDao;
import me.geemu.persistence.model.User;
import me.geemu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private CommonDao commonDao;

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
        List<User> response = commonDao.find(query, User.class);
        return response;
    }
}
