package com.inool.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.inool.lease.model.entity.PaymentType;
import com.inool.lease.web.admin.service.PaymentTypeService;
import com.inool.lease.web.admin.mapper.PaymentTypeMapper;
import org.springframework.stereotype.Service;

/**

* @description 针对表【payment_type(支付方式表)】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class PaymentTypeServiceImpl extends ServiceImpl<PaymentTypeMapper, PaymentType>
    implements PaymentTypeService{

}




