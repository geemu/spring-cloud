package me.geemu.serviceribbon.controller;

import me.geemu.serviceribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/26  16:32
 * Description: user
 */
@RestController
public class HiController {
    @Autowired
    private HiService helloService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
