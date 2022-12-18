package com.frame.modules.system.service.impl;

import com.frame.modules.system.mapper.SysRoleMapper;
import com.frame.modules.system.service.SysPermissionService;
import com.frame.modules.system.service.SysRoleService;
import com.frame.system.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/*
 *@ClassName SysPermissionServiceImpl
 *@Description TODO
 *@Author LiuQi
 *@Date 2022/12/18 10:33
 *@Version 1.0
 */
public class SysPermissionServiceImpl implements SysPermissionService {

    @Autowired
    private SysRoleService roleService;

    /**
     * 获取角色数据权限
     * @param user 用户信息
     * @return 角色权限信息
     */
    @Override
    public Set<String> getRolePermission(SysUser user) {
        // 角色组
        Set<String> roles = new HashSet<>();
        //管理员拥有所有权限
        if(user.isAdmin()){
            //新增 admin 标识
            roles.add("admin");
        }else{
            roles.addAll(roleService.selectRolePermissionByUserId(user.getUserId()));
        }
        System.out.println(roles);
        return roles;
    }

    public static void main(String[] args) {
        final SysUser sysUser = new SysUser();
        sysUser.setUserId(1L);
        new SysPermissionServiceImpl().getRolePermission(sysUser);
    }
}
