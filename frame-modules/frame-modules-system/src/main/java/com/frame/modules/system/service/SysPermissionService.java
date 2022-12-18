package com.frame.modules.system.service;

import com.frame.system.domain.SysUser;

import java.util.Set;

/*
 *@ClassName SysUserService
 *@Description 权限信息 服务层
 *@Author LiuQi
 *@Date 2022/12/17 12:25
 *@Version 1.0
 */
public interface SysPermissionService
{
    /**
     * 获取角色数据权限
     * @param user 用户信息
     * @return 角色权限信息
     */
    Set<String> getRolePermission(SysUser user);
}
