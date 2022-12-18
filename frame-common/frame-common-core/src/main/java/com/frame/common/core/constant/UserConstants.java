package com.frame.common.core.constant;

/*
 *@ClassName UserConstants
 *@Description 用户常量信息
 *@Author LiuQi
 *@Date 2022/12/17 09:33
 *@Version 1.0
 */
public class UserConstants {

    public static final String SYS_USER = "SYS_USER"; //平台内系统用户的唯一标志

    public static final String NORMAL = "0";//正常状态

    public static final String EXCEPTION = "1";//异常状态

    public static final String USER_DISABLE = "1";//用户封禁状态

    public static final String ROLE_DISABLE = "1";//角色封禁状态

    public static final String DEPT_NORMAL = "0";//部门正常状态

    public static final String DEPT_DISABLE = "1";//部门停用状态

    public static final String DICT_NORMAL = "0";//字典正常状态

    public static final String YES = "Y";//是否为系统默认（是）

    public static final String YES_FRAME = "0";//是否菜单外链（是）

    public static final String NO_FRAME = "1";//是否菜单外链（否）

    public static final String TYPE_DIR = "M";//菜单类型（目录）

    public static final String TYPE_MENU = "C";//菜单类型（菜单）

    public static final String TYPE_BUTTON = "F";//菜单类型（按钮）

    public final static String LAYOUT = "Layout";//Layout组件标识

    public final static String PARENT_VIEW = "ParentView";//ParentView组件标识

    public final static String INNER_LINK = "InnerLink";//InnerLink组件标识

    /** 校验返回结果码 */
    public final static String UNIQUE = "0";

    public final static String NOT_UNIQUE = "1";

    /**
     * 用户名长度限制
     */
    public static final int USERNAME_MIN_LENGTH = 2;

    public static final int USERNAME_MAX_LENGTH = 20;

    /**
     * 密码长度限制
     */
    public static final int PASSWORD_MIN_LENGTH = 5;

    public static final int PASSWORD_MAX_LENGTH = 20;
}
