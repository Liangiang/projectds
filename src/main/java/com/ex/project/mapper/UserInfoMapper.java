package com.ex.project.mapper;

import com.ex.project.model.UserInfo;

public interface UserInfoMapper {
    UserInfo loginUser(UserInfo record);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}