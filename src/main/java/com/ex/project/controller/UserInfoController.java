package com.ex.project.controller;

import com.ex.project.model.UserInfo;
import com.ex.project.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController("/user")
@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoServiceImpl;

    /**
     * 用户登录
     * 2019/1/22
     */
    @ResponseBody
    @RequestMapping(value = "/login_user", method = RequestMethod.POST)
    public Map login_user(@RequestBody UserInfo user) {
        Map login_userinfo = userInfoServiceImpl.login_user(user);
        return login_userinfo;
    }


}
