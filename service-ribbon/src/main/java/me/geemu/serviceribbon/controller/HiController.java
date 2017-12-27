package me.geemu.serviceribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import me.geemu.serviceribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/26  16:32
 * Description: user
 */
@RestController
public class HiController {
    @Autowired
    private HiService hiService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name) {
        return hiService.hiService(name);
    }

}
