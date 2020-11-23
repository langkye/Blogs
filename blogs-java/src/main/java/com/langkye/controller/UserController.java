package com.langkye.controller;


import com.langkye.entity.User;
import com.langkye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Langkye
 * @since 2020-11-20
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/test")
    public Object test(){
        return userService.getById(1l);
    }

    /**
     * 测试实体校验
     * @param user User
     * @return User
     */
    @PostMapping("/save")
    public Object testUser(@Validated @RequestBody User user) {
        return user.toString();
    }

}
