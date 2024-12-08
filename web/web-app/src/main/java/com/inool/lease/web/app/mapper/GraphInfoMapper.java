package com.inool.lease.web.app.mapper;

import com.inool.lease.model.entity.GraphInfo;
import com.inool.lease.model.enums.ItemType;
import com.inool.lease.web.app.vo.graph.GraphVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.jmx.export.annotation.ManagedAttribute;

import java.util.List;

/**
* 
* @description 针对表【graph_info(图片信息表)】的数据库操作Mapper
* @createDate 2023-07-26 11:12:39
* @Entity com.inool.lease.model.entity.GraphInfo
*/
@Mapper
public interface GraphInfoMapper extends BaseMapper<GraphInfo> {

    List<GraphVo> selectListByItemTypeAndId(ItemType itemType, Long id);
}




