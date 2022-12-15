package com.frame.auth.service.impl;

import com.frame.auth.service.SysLoginService;
import com.frame.system.model.LoginUser;
import org.springframework.stereotype.Service;

/**
 * @author LiuQi
 * @version 1.0
 * @data 2022/12/15 15:54
 * 登录校验逻辑实现层
 */
@Service
public class SysLoginServiceImpl implements SysLoginService {
    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public LoginUser login(String username, String password) {
        return null;
    }

    /**
     * 注册
     *
     * @param username
     * @param password
     */
    @Override
    public void register(String username, String password) {

    }
}
