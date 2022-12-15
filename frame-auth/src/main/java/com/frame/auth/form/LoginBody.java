package com.frame.auth.form;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LiuQi
 * @version 1.0
 * @data 2022/12/15 15:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginBody {

    private String username; //用户名

    private String password; //密码
}
