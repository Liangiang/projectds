package com.ex.project.mapper;

import com.ex.project.model.ShoppingCarInfo;
import com.ex.project.model.ShoppingCarInfoVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShoppingCarInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShoppingCarInfo record);

    int insertSelective(ShoppingCarInfo record);

    ShoppingCarInfo selectByGId(ShoppingCarInfo record);

    ShoppingCarInfo selectByPrimaryKey(Integer id);

    List<ShoppingCarInfoVO> selectByUId(@Param("uId") Integer uId);

    int updateByPrimaryKeySelective(ShoppingCarInfo record);

    int updateByPrimaryKey(ShoppingCarInfo record);
}