package com.ex.project.mapper;

import com.ex.project.model.ShopInfo;

public interface ShopInfoMapper {
    /**
     * @return int
     * @Author lx
     * @Description 登录
     * @Date 10:02 2019/10/18
     * @Param [id]
     **/
    ShopInfo loginShop(ShopInfo shopInfo);
    int deleteByPrimaryKey(Integer sId);

    int insert(ShopInfo record);

    int insertSelective(ShopInfo record);

    ShopInfo selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(ShopInfo record);

    int updateByPrimaryKey(ShopInfo record);
}