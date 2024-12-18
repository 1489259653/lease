package com.inool.lease.web.app.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.inool.lease.model.entity.BrowsingHistory;
import com.inool.lease.web.app.vo.history.HistoryItemVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Mapper;

/**
* 
* @description 针对表【browsing_history(浏览历史)】的数据库操作Mapper
* @createDate 2023-07-26 11:12:39
* @Entity com.inool.lease.model.entity.BrowsingHistory
*/
@Mapper
public interface BrowsingHistoryMapper extends BaseMapper<BrowsingHistory> {

    IPage<HistoryItemVo> pageHistoryItemByUserId(Page<HistoryItemVo> page, Long userId);
}




