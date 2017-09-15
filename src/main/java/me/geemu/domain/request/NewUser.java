package me.geemu.domain.request;

import lombok.Data;

/**
 * Author: 陈方明
 * Email: cfmmail@sina.com
 * Date: 2017/9/15 10:55
 * Description:
 */
@Data
public class NewUser {

    private String account;
    private String password;
}
