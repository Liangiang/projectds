package com.ex.project.mapper;

import com.ex.project.model.UserInfo;

public interface UserInfoMapper {
    /**
     * @return int
     * @Author lx
     * @Description 登录
     * @Date 10:02 2019/10/18
     * @Param [id]
     **/
    UserInfo loginUser(UserInfo userInfo);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

}