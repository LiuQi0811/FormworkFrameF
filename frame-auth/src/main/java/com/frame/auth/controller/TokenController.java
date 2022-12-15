package com.frame.auth.controller;

import com.frame.auth.form.LoginBody;
import com.frame.core.domain.R;
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
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public R<?> login(@RequestBody LoginBody loginBody) {
        return R.ok();
    }
}
