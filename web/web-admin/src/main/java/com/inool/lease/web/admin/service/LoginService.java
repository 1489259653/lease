package com.inool.lease.web.admin.service;

import com.inool.lease.web.admin.vo.login.CaptchaVo;
import com.inool.lease.web.admin.vo.login.LoginVo;
import com.inool.lease.web.admin.vo.system.user.SystemUserInfoVo;

public interface LoginService {

    CaptchaVo getCaptcha();

    String login(LoginVo loginVo);

    SystemUserInfoVo getLoginUserInfo(Long userId);
}
