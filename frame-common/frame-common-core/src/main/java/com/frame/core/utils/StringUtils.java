package com.frame.core.utils;

/**
 * @author LiuQi
 * @version 1.0
 * @data 2022/12/15 17:29
 * 字符串工具类 基于apache.commons.lang3封装
 */
public class StringUtils  extends org.apache.commons.lang3.StringUtils
{
    /**
     * * 判断一个对象是否非空
     *
     * @param object Object
     * @return true：非空 false：空
     */
    public static boolean isNotNull(Object object)
    {
        return !isNull(object);
    }
    /**
     * * 判断一个对象是否为空
     *
     * @param object Object
     * @return true：为空 false：非空
     */
    public static boolean isNull(Object object)
    {
        return object == null;
    }
}
