package com.thinkive.workspace.userservice.service;

import com.thinkive.workspace.userservice.bean.User;

/**
 * @描述:
 * @作者: 袁祖平
 * @创建日期: 2018年11月08日   10:42:13
 * @修改者: 袁祖平
 * @修改时间: 2018年11月08日   10:42:13
 */

public interface UserService {

    User userLogin(String account);
}
