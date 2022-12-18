package com.frame.modules.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.frame.modules.system.mapper.SysUserMapper;
import com.frame.system.domain.SysUser;

/*
 *@ClassName SysUserService
 *@Description 用户逻辑层
 *@Author LiuQi
 *@Date 2022/12/17 12:25
 *@Version 1.0
 */
public interface SysUserService extends IService<SysUser> {

    /**
     * 通过用户名查询用户
     * @param userName 用户名
     * @return 用户对象信息
     */
    SysUser selectUserByUserName(String userName);
}
