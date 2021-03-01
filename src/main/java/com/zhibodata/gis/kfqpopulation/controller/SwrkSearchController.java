package com.zhibodata.gis.kfqpopulation.controller;

import com.zhibodata.gis.kfqpopulation.common.AdminPermission;
import com.zhibodata.gis.kfqpopulation.common.CommonRes;
import com.zhibodata.gis.kfqpopulation.common.InsertAnnotation;
import com.zhibodata.gis.kfqpopulation.dto.indto.*;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.SwrkPopulationInfoOutDto;
import com.zhibodata.gis.kfqpopulation.mapper.SwrkPopulationMapper;
import com.zhibodata.gis.kfqpopulation.model.TpBasicPopulationAll;
import com.zhibodata.gis.kfqpopulation.service.GeneralSearchService;
import com.zhibodata.gis.kfqpopulation.service.SwrkSearchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 综合查询
 * 综合管理的里死亡人口的查询的逻辑
 */
@Api(tags = "死亡人口")
@RestController
@RequestMapping("/swrk")
public class SwrkSearchController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private SwrkSearchService swrkSearchService;
//
    @AdminPermission
    @PostMapping("/querySwrkList")
    @ApiOperation(value = "死亡人口管理-人员列表")
    public CommonRes querySwrkList(@RequestBody(required = false) SwrkQueryListInDto inDto) {
        RPage rPage = swrkSearchService.querySwrkList(inDto);
        return CommonRes.create(rPage);
    }


    @InsertAnnotation
    @AdminPermission
    @PostMapping("/querySwrkInfo")
    @ApiOperation(value = "死亡人口管理-人员详情")
    public CommonRes querySwrkInfo(@RequestBody(required = false) SwrkQueryInfoInDto inDto) {
        SwrkPopulationInfoOutDto swrkPopulationInfoOutDto =   swrkSearchService.querySwrkInfo(inDto);
        return CommonRes.create(swrkPopulationInfoOutDto);
    }
}
