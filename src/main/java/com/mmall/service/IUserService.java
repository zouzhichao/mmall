package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by Administrator on 2017/8/28.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);
}
