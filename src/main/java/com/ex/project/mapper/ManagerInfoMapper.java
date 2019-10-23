package com.ex.project.mapper;

import com.ex.project.model.ManagerInfo;

public interface ManagerInfoMapper {
    ManagerInfo loginMan(ManagerInfo record);

    int deleteByPrimaryKey(Integer mId);

    int insert(ManagerInfo record);

    int insertSelective(ManagerInfo record);

    ManagerInfo selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(ManagerInfo record);

    int updateByPrimaryKey(ManagerInfo record);
}