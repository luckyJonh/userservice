package com.thinkive.workspace.userservice;

import com.thinkive.workspace.userservice.bean.User;
import com.thinkive.workspace.userservice.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserserviceApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    public void contextLoads() {
        User user = userService.userLogin("lilei");
        System.out.println(user);
    }

}
