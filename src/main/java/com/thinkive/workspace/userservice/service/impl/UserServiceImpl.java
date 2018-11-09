package com.thinkive.workspace.userservice.service.impl;

import com.thinkive.workspace.userservice.Mapper.UserMapper;
import com.thinkive.workspace.userservice.bean.User;
import com.thinkive.workspace.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * @描述:
 * @作者: 袁祖平
 * @创建日期: 2018年11月08日   10:42:32
 * @修改者: 袁祖平
 * @修改时间: 2018年11月08日   10:42:32
 */
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User userLogin(String account) {
        User user = userMapper.userLogin(account);

        return user;
    }
}
