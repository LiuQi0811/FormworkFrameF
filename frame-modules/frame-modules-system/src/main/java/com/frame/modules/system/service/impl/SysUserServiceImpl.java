package com.frame.modules.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.frame.modules.system.mapper.SysUserMapper;
import com.frame.modules.system.service.SysUserService;
import com.frame.system.domain.SysUser;
import org.springframework.stereotype.Service;

/*
 *@ClassName SysUserServiceImpl
 *@Description 用户逻辑实现层
 *@Author LiuQi
 *@Date 2022/12/17 12:26
 *@Version 1.0
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    /**
     * 通过用户名查询用户
     * @param userName 用户名
     * @return 用户对象信息
     */
    public SysUser selectUserByUserName(String userName) {
        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.eq(SysUser::getUserName,userName)
                .eq(SysUser::getDelFlag,"0");
        return this.baseMapper.selectOne(queryWrapper);
    }
}
