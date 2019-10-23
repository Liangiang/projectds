package com.ex.project.controller;

import com.ex.project.model.ManagerInfo;
import com.ex.project.service.ManagerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController("/manager")
public class ManagerInfoController {

    @Autowired
    private ManagerInfoService managerInfoService;

    /**
     * @Author lx
     * @Description  登录
     * @Date 15:21 2019/10/23
     * @Param [managerInfo]
     * @return java.util.Map
     **/
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Map login_manager(@RequestBody ManagerInfo managerInfo) {
        Map returnData = managerInfoService.login_manager(managerInfo);
        return returnData;
    }
}
