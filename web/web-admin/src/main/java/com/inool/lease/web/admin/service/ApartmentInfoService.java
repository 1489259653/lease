package com.inool.lease.web.admin.service;

import com.inool.lease.model.entity.ApartmentInfo;
import com.inool.lease.web.admin.vo.apartment.ApartmentDetailVo;
import com.inool.lease.web.admin.vo.apartment.ApartmentItemVo;
import com.inool.lease.web.admin.vo.apartment.ApartmentQueryVo;
import com.inool.lease.web.admin.vo.apartment.ApartmentSubmitVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**

* @description 针对表【apartment_info(公寓信息表)】的数据库操作Service
* @createDate 2023-07-24 15:48:00
*/
public interface ApartmentInfoService extends IService<ApartmentInfo> {

    void saveOrUpdateApartment(ApartmentSubmitVo apartmentSubmitVo);

    IPage<ApartmentItemVo> pageApartmentItemByQuery(IPage<ApartmentItemVo> page, ApartmentQueryVo queryVo);

    ApartmentDetailVo getApartmentDetailById(Long id);

    void removeApartmentById(Long id);
}
