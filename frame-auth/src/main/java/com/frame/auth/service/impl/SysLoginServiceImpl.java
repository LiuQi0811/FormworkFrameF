package com.frame.auth.service.impl;

import com.frame.auth.service.SysLoginService;
import com.frame.common.core.constant.UserConstants;
import com.frame.common.core.exception.ServiceException;
import com.frame.system.model.LoginUser;
import org.apache.commons.lang3.StringUtils;
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
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public LoginUser login(String username, String password) {
        if (StringUtils.isAnyBlank(username, password)) { // 用户名或密码为空 错误
            throw new ServiceException("用户/密码必须填写");
        }
        if (username.length() < UserConstants.USERNAME_MIN_LENGTH || username.length() > UserConstants.USERNAME_MAX_LENGTH) {   //用户名长度小于 2 || 用户名长度大于20
            // 用户名不在指定范围内 错误
            throw new ServiceException("用户名不在指定范围");

        }
        if (password.length() < UserConstants.PASSWORD_MIN_LENGTH || password.length() > UserConstants.PASSWORD_MAX_LENGTH) { //密码长度小于 5 || 密码长度大于20
            //密码如果不在指定范围内 错误
            throw new ServiceException("用户密码不在指定范围");
        }
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
