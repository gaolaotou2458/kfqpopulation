package com.zhibodata.gis.kfqpopulation.controller;

import com.zhibodata.gis.kfqpopulation.common.AdminPermission;
import com.zhibodata.gis.kfqpopulation.common.CommonRes;
import com.zhibodata.gis.kfqpopulation.common.InsertAnnotation;
import com.zhibodata.gis.kfqpopulation.dto.indto.Page;
import com.zhibodata.gis.kfqpopulation.dto.indto.search.KeyPopulation.DetailInDto;
import com.zhibodata.gis.kfqpopulation.dto.indto.search.KeyPopulation.PopulationCommonSearchInDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;
import com.zhibodata.gis.kfqpopulation.model.PersonBasicInfo;
import com.zhibodata.gis.kfqpopulation.service.KeyPopulationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

/**
 * 重点人口
 * 后台重点人口的查询
 */
@Api(tags = "重点人口")
@RestController
@RequestMapping("/keyPopulation")
public class KeyPopulationController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private KeyPopulationService keyPopulationService;

    @PostMapping("/getKeyPopulationList")
    @ApiOperation(value = "获取重点人口分页列表")
    @AdminPermission
    public CommonRes getKeyPopulationList(@RequestBody(required = false) PopulationCommonSearchInDto inDto, Page page) {
        RPage keyPopulationListWithPage = keyPopulationService.queryKeyPopulationWithPage(page, inDto);
        return CommonRes.create(keyPopulationListWithPage);
    }

    @InsertAnnotation
    @PostMapping("/getKeyPopulationDetail")
    @ApiOperation(value = "根据id获取重点人口详细信息")
    @AdminPermission
    public CommonRes getKeyPopulationById(@RequestBody(required = false) @Valid DetailInDto inDto) {
        return CommonRes.create(keyPopulationService.queryDetail(inDto));
    }

//    @PostMapping("/saveKeyPopulation")
//    @ApiOperation(value = "保存重点人口信息")
//    public CommonRes saveKeyPopulation(@RequestBody(required = false) PersonBasicInfo personBasicInfo) {
//        int i = 0;
//        return CommonRes.create(i);
//    }
//
//    @PostMapping("/updateKeyPopulation")
//    @ApiOperation(value = "修改重点人口信息")
//    public CommonRes updateKeyPopulation(@RequestBody(required = false) PersonBasicInfo personBasicInfo) {
//        int i = 0;
//        return CommonRes.create(i);
//    }
//
//    @GetMapping("/deletekeyPopulation")
//    @ApiOperation(value = "根据id删除重点人口")
//    public CommonRes deletekeyPopulation(@RequestParam(value = "id") String id) {
//        int i = 0;
//        return CommonRes.create(i);
//    }


}
