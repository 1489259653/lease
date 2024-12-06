package com.inool.lease.web.app.test;

import com.inool.lease.common.mail.EmailApi;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonManagerApplicationTests {
    @Resource
    EmailApi emailApi;

    @Test
    void testMailSend() {
        emailApi.sendHtmlEmail("测试",  "<h1>测试邮件</h1>",  "1489259653@qq.com");
    }
}
