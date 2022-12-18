package com.frame.system.domain;

import com.frame.common.core.web.domain.BaseEntity;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/*
 *@ClassName SysDept
 *@Description 部门对象 sys_dept
 *@Author LiuQi
 *@Date 2022/12/17 12:39
 *@Version 1.0
 */
@Data
@Builder
public class SysDept extends BaseEntity {
    private Long deptId;//部门id
    private Long parentId;//父部门id
    private String ancestors;//祖级列表
    private String deptName; //部门名称
    private Integer orderNum;//显示顺序
    private String leader;//负责人
    private String phone;//联系电话
    private String email;//邮箱
    private String status;//部门状态:0正常,1停用
    private String delFlag;//删除标志（0代表存在 2代表删除）
    private String parentName;//父部门名称
    private List<SysDept> children = new ArrayList<SysDept>();//子部门

}
