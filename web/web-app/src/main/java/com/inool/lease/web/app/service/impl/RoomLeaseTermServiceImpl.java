package com.inool.lease.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.inool.lease.model.entity.RoomLeaseTerm;
import com.inool.lease.web.app.service.RoomLeaseTermService;
import com.inool.lease.web.app.mapper.RoomLeaseTermMapper;
import org.springframework.stereotype.Service;

/**
* 
* @description 针对表【room_lease_term(房间租期管理表)】的数据库操作Service实现
* @createDate 2023-07-26 11:12:39
*/
@Service
public class RoomLeaseTermServiceImpl extends ServiceImpl<RoomLeaseTermMapper, RoomLeaseTerm>
    implements RoomLeaseTermService{

}




