package com.inool.lease.web.app.mapper;

import com.inool.lease.model.entity.ApartmentInfo;
import com.inool.lease.web.app.vo.apartment.ApartmentItemVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* 
* @description 针对表【apartment_info(公寓信息表)】的数据库操作Mapper
* @createDate 2023-07-26 11:12:39
* @Entity com.inool.lease.model.entity.ApartmentInfo
*/
@Mapper
public interface ApartmentInfoMapper extends BaseMapper<ApartmentInfo> {

}




