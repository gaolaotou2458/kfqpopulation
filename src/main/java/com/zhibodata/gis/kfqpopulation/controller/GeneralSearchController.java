package com.zhibodata.gis.kfqpopulation.controller;

import com.zhibodata.gis.kfqpopulation.common.AdminPermission;
import com.zhibodata.gis.kfqpopulation.common.CommonRes;
import com.zhibodata.gis.kfqpopulation.common.InsertAnnotation;
import com.zhibodata.gis.kfqpopulation.dto.indto.*;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;
import com.zhibodata.gis.kfqpopulation.model.TpBasicPopulationAll;
import com.zhibodata.gis.kfqpopulation.model.ViewTpBasicPopulation;
import com.zhibodata.gis.kfqpopulation.service.GeneralSearchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 综合查询
 * 后台
 *
 */
@Api(tags = "综合查询")
@RestController
@RequestMapping("/general")
public class GeneralSearchController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private GeneralSearchService generalSearchService;


    @AdminPermission
    @PostMapping("/queryPeopleGeneralList")
    @ApiOperation(value = "综合管理-人员信息列表查询")
    public CommonRes queryPeopleGeneralList(@RequestBody(required = false) GeneralQueryListInDto inDto) {
        RPage rPage = generalSearchService.queryPeopleGeneralList(inDto);
        return CommonRes.create(rPage);
    }


    @AdminPermission
    @InsertAnnotation
    @PostMapping("/queryPeopleGeneralInfo")
    @ApiOperation(value = "综合管理-人员信息详情查询")
    public CommonRes queryPeopleGeneralInfo(@RequestBody(required = false) GeneraQueryInfoInDto inDto) {
        TpBasicPopulationAll tpBasicPopulationAll = generalSearchService.queryPeopleGeneralInfo(inDto);
        return CommonRes.create(tpBasicPopulationAll);
    }


    @AdminPermission
    @PostMapping("/queryHouseMemberList")
    @ApiOperation(value = "综合管理-以房查户列表")
    public CommonRes queryHouseMemberList(@RequestBody(required = false) GeneralHouseMemberListInDto inDto) {
        RPage rPage = generalSearchService.queryHouseNumberList(inDto);
        return CommonRes.create(rPage);
    }


    @AdminPermission
    @PostMapping("/queryHouseHzMemberInfo")
    @ApiOperation(value = "综合管理-以户查人详情(查询户主信息)")
    @InsertAnnotation
    public CommonRes queryHouseMemberInfo(@RequestBody(required = false) GeneralHouseMemberInfoInDto inDto) {
        RPage rPage = generalSearchService.queryHouseMemberInfoList(inDto);
        return CommonRes.create(rPage);
    }


//    @AdminPermission
//    @PostMapping("/queryHouseMemberInfoByHouse")
//    @ApiOperation(value = "综合管理-以房查人列表")
//    public CommonRes queryHouseMemberInfoByHouse(@RequestBody(required = false) GeneralPeopleMemberInfoInDto inDto) {
//        RPage rPage = generalSearchService.queryHouseMemberInfoByHouse(inDto);
//        return CommonRes.create(rPage);
//    }



    @AdminPermission
    @PostMapping("/queryHouseMemberInfo")
    @ApiOperation(value = "综合管理-以房查人详情")
    @InsertAnnotation
    public CommonRes queryHouseMemberInfo(@RequestBody(required = false) GeneraYfcrInfoInDto inDto) {
        RPage rPage = generalSearchService.queryHouseMemberInfo(inDto);
        return CommonRes.create(rPage);
    }






}
