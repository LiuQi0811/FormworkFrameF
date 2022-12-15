package com.frame.core.web.domain;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * @author LiuQi
 * @version 1.0
 * @data 2022/12/15 16:04
 * BaseEntity 通用父类
 */
@Data
@Builder
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String searchValue; //搜索值
    private String createBy; //创建者
    private LocalDateTime createTime; //创建时间
    private String updateBy; //更新者
    private LocalDateTime updateTime; //更新时间
    private String remark; //备注
    private Map<String, Object> params; //请求参数

}
