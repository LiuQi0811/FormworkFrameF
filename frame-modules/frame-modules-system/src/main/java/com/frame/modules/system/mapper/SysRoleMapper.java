package com.frame.modules.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.frame.system.domain.SysRole;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/*
 *@ClassName SysRoleMapper
 *@Description 角色信息 数据层
 *@Author LiuQi
 *@Date 2022/12/18 11:18
 *@Version 1.0
 */
public interface SysRoleMapper extends BaseMapper<SysRole>
{
    /**
     * 根据用户id 查询角色
     * @param userId
     * @return
     */
    @Select(value = {
            "SELECT distinct r.role_id, r.role_name, r.role_key, r.role_sort, r.data_scope, r.menu_check_strictly, r.dept_check_strictly,\n" +
                    "            r.status, r.del_flag, r.create_time, r.remark \n" +
                    "        FROM sys_role r\n" +
                    "\t        LEFT JOIN sys_user_role ur on ur.role_id = r.role_id\n" +
                    "\t        LEFT JOIN sys_user u on u.user_id = ur.user_id\n" +
                    "\t        LEFT JOIN sys_dept d on u.dept_id = d.dept_id"+
                    "WHERE r.del_flag = '0' and ur.user_id = #{userId}"

    })
   List<SysRole> selectRolePermissionByUserId(Long userId);
}
