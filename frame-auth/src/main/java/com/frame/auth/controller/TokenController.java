package com.frame.auth.controller;

import com.frame.auth.form.LoginBody;
import com.frame.auth.service.SysLoginService;
import com.frame.common.core.domain.R;
import com.frame.system.model.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuQi
 * @version 1.0
 * @data 2022/12/15 14:03
 */
@RestController
public class TokenController {
    @Autowired
    private SysLoginService loginService;
    /**
     * 登录
     * @param loginBody
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public R<?> login(@RequestBody LoginBody loginBody) {
        LoginUser login = loginService.login(loginBody.getUsername(), loginBody.getPassword());
        return R.ok(login);
    }
}
