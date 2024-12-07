package com.inool.lease.web.app.test;

import com.inool.lease.model.entity.PaymentType;
import com.inool.lease.web.app.mapper.PaymentTypeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PaymentTypeTests {
    @Autowired
    private PaymentTypeMapper paymentTypeMapper;
    @Test
    void testSelectPaymentListByRoomId(){
       List<PaymentType> list =  paymentTypeMapper.selectListByRoomId(2L);
        for (PaymentType l :list  ) {
            System.out.println(l);
        }
    }
}
