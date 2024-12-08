package com.inool.lease.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.inool.lease.model.entity.RoomLabel;
import com.inool.lease.web.app.service.RoomLabelService;
import com.inool.lease.web.app.mapper.RoomLabelMapper;
import org.springframework.stereotype.Service;

/**
* 
* @description 针对表【room_label(房间&标签关联表)】的数据库操作Service实现
* @createDate 2023-07-26 11:12:39
*/
@Service
public class RoomLabelServiceImpl extends ServiceImpl<RoomLabelMapper, RoomLabel>
    implements RoomLabelService{

}




