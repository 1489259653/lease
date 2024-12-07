package com.inool.lease.web.app.controller.payment;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.inool.lease.common.result.Result;
import com.inool.lease.model.entity.PaymentType;
import com.inool.lease.model.entity.RoomInfo;
import com.inool.lease.web.app.service.PaymentTypeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "支付方式接口")
@RestController
@RequestMapping("/app/payment")
public class PaymentTypeController {
    @Autowired
    private PaymentTypeService service;
    @Operation(summary = "根据房间id获取可选支付方式列表")
    @GetMapping("listByRoomId")
    public Result<List<PaymentType>> list(@RequestParam Long id) {
        List<PaymentType> list = service.listByRoomId(id);
        return Result.ok(list);
    }

    @Operation(summary = "获取全部支付方式列表")
    @GetMapping("list")
    public Result<List<PaymentType>> list() {
        List<PaymentType> list= service.list();
        return Result.ok(list);
    }
}
