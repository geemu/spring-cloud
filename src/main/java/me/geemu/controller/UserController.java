package me.geemu.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.geemu.domain.request.NewUser;
import me.geemu.persistence.model.User;
import me.geemu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: 陈方明
 * Email: cfmmail@sina.com
 * Date: 2017/9/14 18:21
 * Description:
 */
@RestController
@RequestMapping("user")
@Api(description = "用户")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "根据姓查询用户集合", notes = "根据姓查询用户集合", response = User.class)
    @GetMapping("first_name/{firstName}")
    public List<User> findByFirstName(@PathVariable("firstName") String firstName) {
        return userService.findByFirstName(firstName);
    }

    @ApiOperation(value = "新增一个用户", notes = "新增一个用户", response = String.class)
    @PostMapping("")
    public String createOneUser(@RequestBody() NewUser newUser) {
        return userService.createOneUser(newUser);
    }
}
