package com.zhibodata.gis.kfqpopulation.controller;

import com.zhibodata.gis.kfqpopulation.common.CommonRes;
import com.zhibodata.gis.kfqpopulation.dto.indto.HouseInDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;
import com.zhibodata.gis.kfqpopulation.mapper.CfJianzhuMapper;
import com.zhibodata.gis.kfqpopulation.model.CfBuilding;
import com.zhibodata.gis.kfqpopulation.model.CfJianzhu;
import com.zhibodata.gis.kfqpopulation.model.HouseInfo;
import com.zhibodata.gis.kfqpopulation.service.HouseInfoService;
import com.zhibodata.gis.kfqpopulation.service.SysService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台
 */
@Api(tags = "房屋信息")
@RestController
@RequestMapping("/house")
public class HouseInfoController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private HouseInfoService houseInfoService;

    @PostMapping("/getHouseList")
    @ApiOperation(value = "获取房屋列表")
    public CommonRes getHouseList(@RequestBody(required = false) HouseInDto houseInDto) {
        RPage rPage = houseInfoService.queryHouseList(houseInDto);
        return CommonRes.create(rPage);
    }

    @GetMapping("/getHouseById")
    @ApiOperation(value = "根据id获取房屋")
    public CommonRes getHouseById(@RequestParam(value = "id") String id) {
        CfBuilding cfBuilding = houseInfoService.queryHouseInfo(id);
        return CommonRes.create(cfBuilding);
    }

//    @PostMapping("/saveHouse")
//    @ApiOperation(value = "保存房屋信息")
//    public CommonRes saveHouse(@RequestBody(required = false) HouseInfo houseInfo) {
//        int i = 0;
//        return CommonRes.create(i);
//    }
//
//    @PostMapping("/updateHouse")
//    @ApiOperation(value = "修改房屋信息")
//    public CommonRes updateHouse(@RequestBody(required = false) HouseInfo houseInfo) {
//        int i = 0;
//        return CommonRes.create(i);
//    }
//
//    @GetMapping("/deleteHouse")
//    @ApiOperation(value = "根据id删除房屋")
//    public CommonRes deleteHouse(@RequestParam(value = "id") String id) {
//        int i = 0;
//        return CommonRes.create(i);
//    }

}
