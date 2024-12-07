package com.inool.lease.web.app.service.impl;

import com.inool.lease.model.entity.ApartmentInfo;
import com.inool.lease.web.app.mapper.ApartmentInfoMapper;
import com.inool.lease.web.app.service.ApartmentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 
 * @description 针对表【apartment_info(公寓信息表)】的数据库操作Service实现
 * @createDate 2023-07-26 11:12:39
 */
@Service
public class ApartmentInfoServiceImpl extends ServiceImpl<ApartmentInfoMapper, ApartmentInfo>
        implements ApartmentInfoService {
}




