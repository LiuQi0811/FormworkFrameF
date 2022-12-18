package com.frame.system.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *@ClassName SysUserRole
 *@Description 用户和角色关联 sys_user_role
 *@Author LiuQi
 *@Date 2022/12/18 11:48
 *@Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysUserRole {

    private Long userId;// 用户id

    private Long roleId;//角色id
}
