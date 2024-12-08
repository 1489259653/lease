package com.inool.lease.web.app.mapper;

import com.inool.lease.model.entity.LabelInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* 
* @description 针对表【label_info(标签信息表)】的数据库操作Mapper
* @createDate 2023-07-26 11:12:39
* @Entity com.inool.lease.model.entity.LabelInfo
*/
@Mapper
public interface LabelInfoMapper extends BaseMapper<LabelInfo> {

    List<LabelInfo> selectListByRoomId(Long id);

    List<LabelInfo> selectListByApartmentId(Long apartmentId);
}




