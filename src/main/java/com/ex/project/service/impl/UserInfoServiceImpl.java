package com.ex.project.service.impl;

import com.ex.project.mapper.UserInfoMapper;
import com.ex.project.model.UserInfo;
import com.ex.project.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public int insert_user(UserInfo userInfo) {
        int returnData = userInfoMapper.insertSelective(userInfo);
        return returnData;
    }

    /**
     * @return java.util.Map
     * @Author lx
     * @Description 登录
     * @Date 10:09 2019/10/18
     * @Param [userInfo]
     **/
    @Override
    public Map login_user(UserInfo userInfo) {
        Map returndata = new HashMap();
        UserInfo reuser = userInfoMapper.loginUser(userInfo);
        if (reuser != null) {
            if (reuser.getPassword().equals(userInfo.getPassword())) {
                //1是登录成功
                returndata.put("flag", 1);
                returndata.put("nickName", reuser.getNickName());
                returndata.put("realName", reuser.getName());
                returndata.put("userId", reuser.getId());
            } else {
                //500 密码错了
                returndata.put("flag", 500);
            }
        } else {
            //404-没用户
            returndata.put("flag", 404);
        }
        return null;

    }

    @Override
    public int up_user(UserInfo userInfo) {
        int returnData = userInfoMapper.updateByPrimaryKeySelective(userInfo);
        return returnData;
    }
}
