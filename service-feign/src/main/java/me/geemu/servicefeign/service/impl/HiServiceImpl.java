package me.geemu.servicefeign.service.impl;

import me.geemu.servicefeign.service.HiService;
import org.springframework.stereotype.Component;

/**
 * @author Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/27  12:02
 * Description: user
 */
@Component
public class HiServiceImpl implements HiService {
    /**
     * 打招呼
     *
     * @param name 打招呼
     * @return 打招呼
     */
    @Override
    public String hiService(String name) {
        return "sorry:" + name;
    }
}
