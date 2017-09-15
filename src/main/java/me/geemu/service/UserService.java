package me.geemu.service;

import me.geemu.model.User;

import java.util.List;

/**
 * Author: 陈方明
 * Email: cfmmail@sina.com
 * Date: 2017/9/14 18:09
 * Description:
 */
public interface UserService {

    List<User> findByFirstName(String firstName);
}
