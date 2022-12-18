package com.frame.modules.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.frame.system.domain.SysRole;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Set;

/*
 *@ClassName SysRoleService
 *@Description 角色业务层
 *@Author LiuQi
 *@Date 2022/12/18 10:38
 *@Version 1.0
 */
public interface SysRoleService extends IService<SysRole>
{

    /**
     * 根据用户id查询角色权限
     * @param userId 用户id
     * @return 权限列表
     */
    Set<String> selectRolePermissionByUserId(Long userId);
}
