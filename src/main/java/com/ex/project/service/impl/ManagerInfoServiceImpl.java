package com.ex.project.service.impl;

import com.ex.project.mapper.ManagerInfoMapper;
import com.ex.project.model.ManagerInfo;
import com.ex.project.service.ManagerInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class ManagerInfoServiceImpl implements ManagerInfoService {

    @Resource
    private ManagerInfoMapper managerInfoMapper;

    @Override
    public Map login_manager(ManagerInfo managerInfo) {
        Map returndata = new HashMap();
        ManagerInfo reman = managerInfoMapper.loginMan(managerInfo);
        if (reman != null) {
            if (reman.getmPassword().equals(managerInfo.getmPassword())) {
                //1是登录成功
                returndata.put("flag", 1);
                returndata.put("nickName", "");
                returndata.put("realName", reman.getmName());
                returndata.put("userId", reman.getmId());
            } else {
                //500 密码错了
                returndata.put("flag", 500);
            }
        } else {
            //404-没用户
            returndata.put("flag", 404);
        }
        return returndata;
    }
}
