package com.frame.core.web.domain;

import com.frame.core.utils.StringUtils;

import java.util.HashMap;

/**
 * @author LiuQi
 * @version 1.0
 * @data 2022/12/15 17:23
 * 操作消息提醒
 */
public class AjaxResult extends HashMap<String,Object>
{
    private static final long serialVersionUID = 1L;
    public static final String CODE_TAG = "code";
    public static final String MSG_TAG = "msg";
    public static final String DATA_TAG = "data";
    public AjaxResult(){

    }
    public AjaxResult(int code,String msg){
        super.put(CODE_TAG,code);
        super.put(MSG_TAG,msg);
    }
    public AjaxResult(int code,String msg,Object data){
        super.put(CODE_TAG,code);
        super.put(MSG_TAG,msg);
        if(StringUtils.isNotNull(data)){

        }
    }
}
