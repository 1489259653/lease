package com.inool.lease.web.app.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.context.annotation.Bean;


public interface EmailService{
    void sendCode(String phone, String verifyCode);
}
