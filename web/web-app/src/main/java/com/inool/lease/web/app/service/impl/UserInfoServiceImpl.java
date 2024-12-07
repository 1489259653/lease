package com.inool.lease.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.inool.lease.model.entity.UserInfo;
import com.inool.lease.web.app.service.UserInfoService;
import com.inool.lease.web.app.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* 
* @description 针对表【user_info(用户信息表)】的数据库操作Service实现
* @createDate 2023-07-26 11:12:39
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

}




