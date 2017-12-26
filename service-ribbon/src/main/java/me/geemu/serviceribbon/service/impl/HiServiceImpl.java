package me.geemu.serviceribbon.service.impl;

import me.geemu.serviceribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/26  16:29
 * Description: user
 */
@Service
public class HiServiceImpl implements HiService {
    @Autowired
    RestTemplate restTemplate;

    /**
     * 打招呼
     *
     * @param name 打招呼
     * @return 返回
     */
    @Override
    public String hiService(String name) {
        return restTemplate.getForObject("http://service-hi/hi?name=" + name, String.class);
    }
}
