package com.frame.system.domain;

import com.frame.common.core.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author LiuQi
 * @version 1.0
 * @data 2022/12/15 16:03
 * 用户对象 sys_user
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SysUser extends BaseEntity {
    private Long userId;//用户id
    private Long deptId;//部门id
    private String userName;//用户账号
    private String nickName;//用户昵称
    private String email;//用户邮箱
    private String phoneNumber;//手机号码
    private String sex;//用户性别
    private String avatar;//用户头像
    private String password;//密码
    private String status;//帐号状态（0正常 1停用）
    private String delFlag;// 删除标志（0代表存在 2代表删除）
    private String loginIp;//最后登录ip
    private LocalDateTime loginDate;//最后登录时间
    private transient SysDept dept; //部门对象
    private transient List<SysRole> roles;//角色对象
    private transient Long[] roleIds;//角色组
    private transient Long[] postIds;//岗位组
    private transient Long roleId;//角色id

    public  boolean isAdmin(){
        return isAdmin(this.userId);
    }
    public static boolean isAdmin(Long userId) {
        return userId != null && userId == 1L;
    }
}
