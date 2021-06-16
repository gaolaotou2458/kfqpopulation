package com.zhibodata.gis.kfqpopulation.controller;

import com.zhibodata.gis.kfqpopulation.common.*;
import com.zhibodata.gis.kfqpopulation.dto.indto.LoginIndto;
import com.zhibodata.gis.kfqpopulation.dto.indto.user.LoginInfoOutDto;
import com.zhibodata.gis.kfqpopulation.dto.indto.user.UserInfoOutDto;
import com.zhibodata.gis.kfqpopulation.model.User;
import com.zhibodata.gis.kfqpopulation.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Api(tags = "用户管理")
@RestController
@RequestMapping("/part/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;


//    @PostMapping("/getUsers")
//    @ApiOperation(value = "获取用户列表")
//    public CommonRes getUsers(@RequestBody UserInDto userInDto) {
//        Map<String, Object> users = userService.getUsers(userInDto);
//        return CommonRes.create(users);
//    }
//
    @GetMapping("/getUserById")
    @ApiOperation(value = "获取用户详情列表")
    public CommonRes getUserById(@RequestParam(name = "id", required = true) String id) {
        User user = userService.getUserById(id);

        return CommonRes.create(user);
    }
//
//    @PostMapping("/addUser")
//    @ApiOperation(value = "注册用户")
//    public CommonRes addUser(@RequestBody @Valid UserAddDto userAddDto, BindingResult bindingResult) throws BusinessException {
//        if(bindingResult.hasErrors()){
//            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR, CommonUtil.processErrorString(bindingResult));
//        }
//        User user = Convert.convert(User.class, userAddDto);
//        int i = userService.addUser(user);
//        return CommonRes.create("注册成功数量："+ i);
//    }
//
//    @PostMapping("/updateUser")
//    @ApiOperation(value = "更新用户")
//    public CommonRes updateUser(@RequestBody @Valid UserUpdateDto userUpdateDto, BindingResult bindingResult) throws BusinessException {
//        if(bindingResult.hasErrors()){
//            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR, CommonUtil.processErrorString(bindingResult));
//        }
//        User user = Convert.convert(User.class, userUpdateDto);
//        int i = userService.updateUser(user);;
//        return CommonRes.create("更新成功数量："+i);
//    }
//
//    @GetMapping("/deleteUser")
//    @ApiOperation(value = "根据id删除用户")
//    public CommonRes deleteUser(@RequestParam(value = "id") String id) {
//        int i = userService.deleteUser(id);;
//        return CommonRes.create("删除成功数量："+i);
//    }



    @PostMapping("/login")
    @ApiOperation(value = "登录验证")
    public CommonRes login(@RequestBody LoginIndto loginIndto, HttpSession session) throws BusinessException {
        LoginInfoOutDto user = userService.login(loginIndto.getUserName(), loginIndto.getPassword());
        if(user != null) {
            session.setAttribute("user",user);
            return CommonRes.create(user);
        }
        CommonError commonError = new CommonError(EmBusinessError.LOGIN_FAIL);
        return CommonRes.create(commonError,"fail");
    }


    //@InsertAnnotation
    @GetMapping("/getUserByUserName")
    @ApiOperation(value = "获取用户详情列表")
    public CommonRes getUserByUserName(@RequestParam(name = "userName", required = true) String userName) {
        User user = userService.getUserByUserName(userName);
        return CommonRes.create(user);
    }
}
