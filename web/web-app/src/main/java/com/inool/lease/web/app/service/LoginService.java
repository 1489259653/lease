package com.inool.lease.web.app.service;

import com.inool.lease.web.app.vo.user.LoginVo;
import com.inool.lease.web.app.vo.user.UserInfoVo;

public interface LoginService {
    void getEMailCode(String email);

    String login(LoginVo loginVo);

    UserInfoVo getUserInfoById(Long userId);
}
