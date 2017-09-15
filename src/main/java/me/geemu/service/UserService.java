package me.geemu.service;


import me.geemu.domain.request.NewUser;
import me.geemu.persistence.model.User;

import java.util.List;

/**
 * Author: 陈方明
 * Email: cfmmail@sina.com
 * Date: 2017/9/14 18:09
 * Description:
 */
public interface UserService {
    /**
     * 根据姓查找用户
     *
     * @param firstName
     * @return
     */
    List<User> findByFirstName(String firstName);

    /**
     * 根据用户名查找用户
     *
     * @param account
     * @return
     */
    User findByAccount(String account);

    /**
     * 创建一个用户   返回主键
     *
     * @return
     */
    String createOneUser(NewUser newUser);
}
