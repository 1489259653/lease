package com.inool.lease.web.app.service.impl;

import com.inool.lease.model.entity.ApartmentInfo;
import com.inool.lease.model.entity.LabelInfo;
import com.inool.lease.model.enums.ItemType;
import com.inool.lease.web.app.mapper.ApartmentInfoMapper;
import com.inool.lease.web.app.mapper.GraphInfoMapper;
import com.inool.lease.web.app.mapper.LabelInfoMapper;
import com.inool.lease.web.app.mapper.RoomInfoMapper;
import com.inool.lease.web.app.service.ApartmentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.inool.lease.web.app.vo.apartment.ApartmentItemVo;
import com.inool.lease.web.app.vo.graph.GraphVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * 
 * @description 针对表【apartment_info(公寓信息表)】的数据库操作Service实现
 * @createDate 2023-07-26 11:12:39
 */
@Service
public class ApartmentInfoServiceImpl extends ServiceImpl<ApartmentInfoMapper, ApartmentInfo>
        implements ApartmentInfoService {
    @Autowired
    private ApartmentInfoMapper apartmentInfoMapper;
    @Autowired
    private LabelInfoMapper labelInfoMapper;
    @Autowired
    private GraphInfoMapper graphInfoMapper;
    @Autowired
    private RoomInfoMapper roomInfoMapper;
    @Override
    public ApartmentItemVo selectApartmentItemVoById(Long apartmentId) {
        ApartmentInfo apartmentInfo = apartmentInfoMapper.selectById(apartmentId);

        List<LabelInfo> labelInfoList = labelInfoMapper.selectListByApartmentId(apartmentId);

        List<GraphVo> graphVoList = graphInfoMapper.selectListByItemTypeAndId(ItemType.APARTMENT, apartmentId);

        BigDecimal minRent = roomInfoMapper.selectMinRentByApartmentId(apartmentId);

        ApartmentItemVo apartmentItemVo = new ApartmentItemVo();
        BeanUtils.copyProperties(apartmentInfo, apartmentItemVo);

        apartmentItemVo.setGraphVoList(graphVoList);
        apartmentItemVo.setLabelInfoList(labelInfoList);
        apartmentItemVo.setMinRent(minRent);
        return apartmentItemVo;
    }
}




