package com.ex.project.controller;

import com.ex.project.model.UserInfo;
import com.ex.project.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.Map;

@RestController("/user")
@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoServiceImpl;

    /**
     * @return int
     * @Author lx
     * @Description 增
     * @Date 15:09 2019/10/23
     * @Param [userInfo]
     **/
    @ResponseBody
    @RequestMapping(value = "/insert_user", method = RequestMethod.POST)
    public int insert_user(@RequestBody UserInfo userInfo) {
        System.out.print(userInfo);
        int a = userInfoServiceImpl.insert_user(userInfo);
        return a;
    }

    /**
     * 用户登录
     * 2019/1/22
     */
    @ResponseBody
    @RequestMapping(value = "/login_user", method = RequestMethod.POST)
    public Map login_user(@RequestBody UserInfo user) {
        Map returnData = userInfoServiceImpl.login_user(user);
        return returnData;
    }

    /**
     * @return int
     * @Author lx
     * @Description 修改
     * @Date 9:49 2019/10/23
     * @Param [user]
     **/
    @ResponseBody
    @RequestMapping(value = "/up_user", method = RequestMethod.POST)
    public int up_user(@RequestBody UserInfo user) {
        int returnData = userInfoServiceImpl.up_user(user);
        return returnData;
    }

    /**
     * @return com.ex.project.model.UserInfo
     * @Author lx
     * @Description 查
     * @Date 15:10 2019/10/23
     * @Param []
     **/
    @ResponseBody
    @RequestMapping(value = "/sel_user", method = RequestMethod.POST)
    public UserInfo sel_user(@RequestBody UserInfo user) {
        UserInfo returnData = userInfoServiceImpl.sel_user(user);
        return returnData;
    }

}
