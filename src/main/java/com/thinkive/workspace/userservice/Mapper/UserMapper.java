package com.thinkive.workspace.userservice.Mapper;

import com.thinkive.workspace.userservice.bean.User;

/**
 * @描述:
 * @作者: 袁祖平
 * @创建日期: 2018年11月08日   10:33:29
 * @修改者: 袁祖平
 * @修改时间: 2018年11月08日   10:33:29
 */

public interface UserMapper {
    User userLogin(String account);
}
