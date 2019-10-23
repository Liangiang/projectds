package com.ex.project.service.impl;

import com.ex.project.mapper.ShopInfoMapper;
import com.ex.project.model.ShopInfo;
import com.ex.project.service.ShopInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class ShopInfoServiceImpl implements ShopInfoService {
    @Resource
    private ShopInfoMapper shopInfoMapper;

    @Override
    public Map login_shop(ShopInfo shopInfo) {
        Map returndata = new HashMap();
        ShopInfo reshop = shopInfoMapper.loginShop(shopInfo);
        if (reshop != null) {
            if (reshop.getsPassword().equals(shopInfo.getsPassword())) {
                //1是登录成功
                returndata.put("flag", 1);
                returndata.put("nickName", "");
                returndata.put("realName", reshop.getsHeadName());
                returndata.put("userId", reshop.getsId());
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

    @Override
    public int add_shop(ShopInfo shopInfo) {
        int returnData = shopInfoMapper.insertSelective(shopInfo);
        return returnData;
    }

    @Override
    public int up_shop(ShopInfo shopInfo) {
        int returnData = shopInfoMapper.updateByPrimaryKeySelective(shopInfo);
        return returnData;
    }

    @Override
    public ShopInfo sel_shop(ShopInfo shopInfo) {
        ShopInfo returnData = shopInfoMapper.selectByPrimaryKey(shopInfo.getsId());
        return returnData;
    }
}
