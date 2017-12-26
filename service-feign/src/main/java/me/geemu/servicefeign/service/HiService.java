package me.geemu.servicefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/26  17:19
 * Description: user
 */
@FeignClient("service-hi")
public interface HiService {
    /**
     * 打招呼
     *
     * @param name 打招呼
     * @return 打招呼
     */
    @GetMapping("hi")
    String hiService(@RequestParam("name") String name);
}
