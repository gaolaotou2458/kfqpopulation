//package com.zhibodata.gis.kfqpopulation.controller;
//
//import com.zhibodata.gis.kfqpopulation.common.CommonRes;
//import com.zhibodata.gis.kfqpopulation.dto.indto.HouseInDto;
//import com.zhibodata.gis.kfqpopulation.dto.indto.HouseholdInDto;
//import com.zhibodata.gis.kfqpopulation.dto.indto.search.PersonInDto;
//import com.zhibodata.gis.kfqpopulation.dto.outdto.search.HoldPersonOutDto;
//import com.zhibodata.gis.kfqpopulation.dto.outdto.search.HouseOutDto;
//import com.zhibodata.gis.kfqpopulation.dto.outdto.search.HousePersonOutDto;
//import com.zhibodata.gis.kfqpopulation.dto.outdto.search.personOutDto;
//import com.zhibodata.gis.kfqpopulation.model.HouseInfo;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@Api(tags = "综合查询")
//@RestController
//@RequestMapping("/search")
//public class SearchController {
//
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @PostMapping("/getPersonList")
//    @ApiOperation(value = "获取人员列表")
//    public CommonRes getPersonList(@RequestBody(required = false) PersonInDto personInDto) {
//        List<personOutDto> personList = null;
//        return CommonRes.create(personList);
//    }
//
//    @PostMapping("/getHouseList")
//    @ApiOperation(value = "根据房屋查询户信息")
//    public CommonRes getHouseList(@RequestBody(required = false) HouseInDto houseInDto) {
//        List<HouseOutDto> houseList = null;
//        return CommonRes.create(houseList);
//    }
//
//    @PostMapping("/getHousePersonList")
//    @ApiOperation(value = "根据房查询人口信息")
//    public CommonRes getHousePersonList(@RequestBody(required = false) HouseInDto houseInDto) {
//        List<HousePersonOutDto> housePersonList = null;
//        return CommonRes.create(housePersonList);
//    }
//
//    @PostMapping("/getHoldPersonList")
//    @ApiOperation(value = "根据户查询人口信息")
//    public CommonRes getHoldPersonList(@RequestBody(required = false) HouseholdInDto householdInDto) {
//        List<HoldPersonOutDto> holdPersonList = null;
//        return CommonRes.create(holdPersonList);
//    }
//}
