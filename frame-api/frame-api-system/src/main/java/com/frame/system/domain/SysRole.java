package com.frame.system.domain;

import com.frame.common.core.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/*
 *@ClassName SysRole
 *@Description 角色对象   sys_role
 *@Author LiuQi
 *@Date 2022/12/17 13:21
 *@Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysRole extends BaseEntity {
    private Long roleId;//角色id
    private String roleName;//角色名称
    private String roleKey;//角色权限
    private Integer roleSort;//角色排序
    private String dataScope;//数据范围（1：所有数据权限；2：自定义数据权限；3：本部门数据权限；4：本部门及以下数据权限；5：仅本人数据权限）
    private boolean menuCheckStrictly;//菜单树选择项是否关联显示（ 0：父子不互相关联显示 1：父子互相关联显示）
    private boolean deptCheckStrictly;//部门树选择项是否关联显示（0：父子不互相关联显示 1：父子互相关联显示 ）
    private String status;//角色状态（0正常 1停用）
    private String delFlag;//删除标志（0代表存在 2代表删除）
    private boolean flag = false;//用户是否存在此角色标识 默认不存在
    private Long[] menuIds;//菜单组
    private Long[] deptIds;//部门组（数据权限）
    private Set<String> permissions;//角色菜单权限

}
