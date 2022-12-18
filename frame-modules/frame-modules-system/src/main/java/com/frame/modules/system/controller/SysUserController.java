package com.frame.modules.system.controller;

import com.frame.common.core.domain.R;
import com.frame.common.core.utils.StringUtils;
import com.frame.common.core.web.controller.BaseController;
import com.frame.modules.system.service.SysUserService;
import com.frame.system.domain.SysUser;
import com.frame.system.model.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 *@ClassName SysUserController
 *@Description 系统用户信息接口
 *@Author LiuQi
 *@Date 2022/12/17 10:26
 *@Version 1.0
 */
@RestController
@RequestMapping(value = "/user")
public class SysUserController extends BaseController {
    @Autowired
    private SysUserService userService;

    /**
     * 获取当前用户信息
     *
     * @param userName
     * @return
     */
    @RequestMapping(value = "/info/{userName}",method = RequestMethod.GET)
    public R<LoginUser> info(@PathVariable(value = "userName") String userName) {
         SysUser sysUser = userService.selectUserByUserName(userName);
         if(StringUtils.isNull(sysUser))
         {
         return R.fail("用户名或密码错误");
         }
         LoginUser loginUser = LoginUser.builder()
                 .sysUser(sysUser)
                 .build();
        return R.ok(loginUser);
    }
}
