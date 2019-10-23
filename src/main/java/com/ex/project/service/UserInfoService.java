package com.ex.project.service;

import com.ex.project.model.UserInfo;

import java.util.Map;

public interface UserInfoService {

    int insert_user(UserInfo userInfo);

    Map login_user(UserInfo userInfo);

    int up_user(UserInfo userInfo);
}
