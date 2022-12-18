package com.frame.system.model;

import com.frame.system.domain.SysUser;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * @author LiuQi
 * @version 1.0
 * @data 2022/12/15 15:59
 * 用户信息
 */
@Data
@Builder
public class LoginUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String token; //用户唯一标识

    private Long userid; //用户名id

    private String username; //用户名

    private Long loginTime; //登录时间

    private Long expireTime;//过期时间

    private String ipaddr;//登录IP地址

    private Set<String> permissions;//权限列表

    private Set<String> roles;//角色列表

    private SysUser sysUser;//用户信息
}
