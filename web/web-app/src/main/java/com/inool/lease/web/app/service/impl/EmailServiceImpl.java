package com.inool.lease.web.app.service.impl;

import com.inool.lease.common.mail.EmailApi;
import com.inool.lease.web.app.service.EmailService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    @Resource
    EmailApi emailApi;
    @Override
    public void sendCode(String email, String verifyCode) {

        try {
            emailApi.sendHtmlEmail("找房牛","您的验证码为"+verifyCode+",一分钟内有效，请勿向他人提供您的验证码",email);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
