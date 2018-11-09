package com.thinkive.workspace.userservice.controller;

import com.thinkive.workspace.userservice.bean.User;
import com.thinkive.workspace.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @描述:
 * @作者: 袁祖平
 * @创建日期: 2018年11月09日   09:21:35
 * @修改者: 袁祖平
 * @修改时间: 2018年11月09日   09:21:35
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
    @Autowired
    private UserService userService;
    @Autowired
    DiscoveryClient client;
    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> loginIn(User user){
        Map<String,Object> map = new HashMap<>();
        try {
            User loginUser = userService.userLogin(user.getAccount());
            if(loginUser != null && loginUser.getPassword() != null && loginUser.getPassword().equals(user.getPassword())){
                map.put(SUCCESS,true);
            }else{
                map.put(SUCCESS,false);
                map.put(MESSAGE,"用户名或密码错误");
            }
        } catch (Exception e) {
            map.put(SUCCESS,false);
            map.put(MESSAGE,e.getMessage());
            e.printStackTrace();
        }
        return map;
    }
}
