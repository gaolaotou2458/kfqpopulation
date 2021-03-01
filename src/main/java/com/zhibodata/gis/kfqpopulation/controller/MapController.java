package com.zhibodata.gis.kfqpopulation.controller;

import cn.hutool.core.lang.tree.Tree;
import com.zhibodata.gis.kfqpopulation.common.AdminPermission;
import com.zhibodata.gis.kfqpopulation.common.CommonRes;
import com.zhibodata.gis.kfqpopulation.common.InsertAnnotation;
import com.zhibodata.gis.kfqpopulation.dto.indto.resource.*;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage2;
import com.zhibodata.gis.kfqpopulation.dto.outdto.map.TpBasicPopulationWithTypeOutDto;
import com.zhibodata.gis.kfqpopulation.service.KeyPopulationService;
import com.zhibodata.gis.kfqpopulation.service.SysService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 一张图
 * 前台一张图
 */
@Api(tags = "一张图")
@RestController
@RequestMapping("/map")
public class MapController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SysService sysService;

    @Autowired
    private KeyPopulationService keyPopulationService;


//    @PostMapping("/getHouseMapList")
//    @ApiOperation(value = "获取房屋点位列表")
//    public CommonRes getHouseMapList(@RequestBody(required = false) HouseInDto houseInDto) {
//        List<HouseInfo> infoList = null;
//        return CommonRes.create(infoList);
//    }

    //@InsertAnnotation
    @GetMapping("/queryAllLayerResource")
    @ApiOperation(value = "获取所有的图层树形列表")
    public CommonRes queryAllLayerResource() {
        List<Tree<String>> trees = sysService.queryAllLayerResource();
        return CommonRes.create(trees);
    }

    @PostMapping("/querySingleLayerList")
    @ApiOperation(value = "查询单个图层列表数据")
    @AdminPermission
    public CommonRes querySingleLayerList(@RequestBody(required = false) QuerySingleLayerIndto singleLayerIndto) {
        RPage2 rPage =  sysService.querySingleLayerList(singleLayerIndto);
        return CommonRes.create(rPage);
    }

    @PostMapping("/querySelectedLayer")
    @ApiOperation(value = "查询选中图层列表数据")
    @AdminPermission
    public CommonRes querySelectedLayer(@RequestBody(required = false) QuerySelectedLayerIndto querySelectedLayerIndto ) {
        FeatureEntity featureEntity = sysService.querySelectedLayer(querySelectedLayerIndto);
        return CommonRes.create(featureEntity);
    }

    @PostMapping("/queryBuildingSum")
    @AdminPermission
    @ApiOperation(value = "查询楼栋的统计信息",notes = "查询楼栋的统计信息")
    public CommonRes queryBuildingSum(@RequestBody(required = false) QueryMapLayerIndto queryMapLayerIndto ) {
        List<Map<String,Object>>   queryMapLayerOutdto =   sysService.queryBuildingSum(queryMapLayerIndto);
        return CommonRes.create(queryMapLayerOutdto);
    }

    @PostMapping("/queryBuildingList")
    @ApiOperation(value = "查询楼栋的列表",notes = "查询楼栋的列表")
    @AdminPermission
    public CommonRes queryBuildingList(@RequestBody(required = false) QueryMapLayerIndto queryMapLayerIndto) {
        RPage rPage =  sysService.queryBuildingList(queryMapLayerIndto);
        return CommonRes.create(rPage);
    }

    @InsertAnnotation
    @PostMapping("/queryPersonListByhh")
    @ApiOperation(value = "查询根据户号人员列表列表",notes = "根据户号查询人员列表")
    @AdminPermission
    public CommonRes queryPersonListByhh(@RequestBody(required = false) QueryPersonListByhhIndto queryPersonListByhhIndto) {
        List<TpBasicPopulationWithTypeOutDto> viewTpBasicPopulations  =  sysService.queryPersonListByhh(queryPersonListByhhIndto);
        return CommonRes.create(viewTpBasicPopulations);
    }




}
