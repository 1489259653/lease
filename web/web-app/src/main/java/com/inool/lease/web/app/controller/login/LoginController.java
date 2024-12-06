package com.inool.lease.web.app.controller.login;


import com.inool.lease.common.login.LoginUserHolder;
import com.inool.lease.common.result.Result;
import com.inool.lease.web.app.service.LoginService;
import com.inool.lease.web.app.vo.user.LoginVo;
import com.inool.lease.web.app.vo.user.UserInfoVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Tag(name = "登录管理")
@RestController
@RequestMapping("/app/")
public class LoginController {

    @Autowired
    private LoginService service;
    @GetMapping("login/getCode")
    @Operation(summary = "获取邮箱验证码")
    public Result getCode(@RequestParam String email) {
        service.getEMailCode(email);
        return Result.ok();
    }

    @PostMapping("login")
    @Operation(summary = "登录")
    public Result<String> login(@RequestBody LoginVo loginVo) {
        String token = service.login(loginVo);
        return Result.ok(token);
    }

    @GetMapping("info")
    @Operation(summary = "获取登录用户信息")
    public Result<UserInfoVo> info() {

        UserInfoVo info = service.getUserInfoById(LoginUserHolder.getLoginUser().getUserId());
        return Result.ok(info);
    }
}

