package com.frame.modules.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.frame.modules.system.mapper.SysRoleMapper;
import com.frame.modules.system.mapper.SysUserMapper;
import com.frame.modules.system.mapper.SysUserRoleMapper;
import com.frame.modules.system.service.SysRoleService;
import com.frame.system.domain.SysRole;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

/*
 *@ClassName SysRoleServiceImpl
 *@Description TODO
 *@Author LiuQi
 *@Date 2022/12/18 11:26
 *@Version 1.0
 */
@Slf4j
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Autowired
    private SysRoleMapper roleMapper;
    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    private SysUserRoleMapper userRoleMapper;


    /**
     * 根据用户id查询角色权限
     *
     * @param userId 用户id
     * @return 权限列表
     */
    @Override
    public Set<String> selectRolePermissionByUserId(Long userId) {
        // 根据用户id查询角色
        List<SysRole> sysRoles = roleMapper.selectRolePermissionByUserId(userId);
        log.info("根据用户id查询角色 返回结果{}",sysRoles);
        return null;
    }
}
