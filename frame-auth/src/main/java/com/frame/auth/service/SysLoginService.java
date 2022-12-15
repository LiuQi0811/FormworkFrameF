package com.frame.auth.service;

import com.frame.system.model.LoginUser;

/**
 * @author LiuQi
 * @version 1.0
 * @data 2022/12/15 15:51
 * 登录校验逻辑层
 */
public interface SysLoginService {
    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    LoginUser login(String username, String password);

    /**
     * 注册
     *
     * @param username
     * @param password
     */
    void register(String username, String password);
}
