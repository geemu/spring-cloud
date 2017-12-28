package me.geemu.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/28  10:15
 * Description: user
 */
@RestController
public class ConfigController {

    @Value("${foo}")
    String foo;

    @GetMapping("/config")
    public String hi() {
        return foo;
    }
}
