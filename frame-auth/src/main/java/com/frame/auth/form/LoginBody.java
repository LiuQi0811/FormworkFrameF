package com.frame.auth.form;
import lombok.Builder;
import lombok.Data;

/**
 * @author LiuQi
 * @version 1.0
 * @data 2022/12/15 15:42
 */
@Data
@Builder
public class LoginBody {

    private String username; //用户名

    private String password; //密码
}
