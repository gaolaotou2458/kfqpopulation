package com.zhibodata.gis.kfqpopulation.controller;

import com.zhibodata.gis.kfqpopulation.common.CommonRes;
import com.zhibodata.gis.kfqpopulation.dto.indto.chart.ChartInDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.DbhChartOutDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.ImportantPeopleNumOutDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.TypeValueOutDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.OverLookInfoOutDto;
import com.zhibodata.gis.kfqpopulation.service.CharService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "图表管理")
@RestController
@RequestMapping("/chart")
public class ChartController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CharService charService;
//    /**
//     * 流动人口管理.
//     */
//    @PostMapping("/getTotalFlowing")
//    @ApiOperation(value = "获取流动人口和户籍人口总数统计数据")
//    public CommonRes getTotalFlowing(@RequestBody(required = false) ChartInDto chartInDto) {
//        Map<String,Object> infoList = null;
//        return CommonRes.create(infoList);
//    }
//
//    @PostMapping("/getAgeDistribution")
//    @ApiOperation(value = "获取年龄分布统计数据")
//    public CommonRes getAgeDistribution(@RequestBody(required = false) ChartInDto chartInDto) {
//        Map<String,Object> infoList = null;
//        return CommonRes.create(infoList);
//    }
//
//    @PostMapping("/getLivingTime")
//    @ApiOperation(value = "获取居住时间统计数据")
//    public CommonRes getLivingTime(@RequestBody(required = false) ChartInDto chartInDto) {
//        Map<String,Object> infoList = null;
//        return CommonRes.create(infoList);
//    }
//
//    @PostMapping("/getComeFrom")
//    @ApiOperation(value = "获取来源地统计数据")
//    public CommonRes getComeFrom(@RequestBody(required = false) ChartInDto chartInDto) {
//        Map<String,Object> infoList = null;
//        return CommonRes.create(infoList);
//    }
//    /**
//     * 重点人口管理.
//     */
//    @PostMapping("/getYearKeyPeopleTotals")
//    @ApiOperation(value = "获取年重点人口统计数量")
//    public CommonRes getYearKeyPeopleTotals(@RequestBody(required = false) ChartInDto chartInDto) {
//        Map<String,Object> infoList = null;
//        return CommonRes.create(infoList);
//    }
//
//    @PostMapping("/getMonthVisitTotals")
//    @ApiOperation(value = "获取月探访记录数")
//    public CommonRes getMonthVisitTotals(@RequestBody(required = false) ChartInDto chartInDto) {
//        Map<String,Object> infoList = null;
//        return CommonRes.create(infoList);
//    }
//
//    /**
//     * 死亡人口
//     */
//    @PostMapping("/getEastDeadTotals")
//    @ApiOperation(value = "获取小区死亡人口数量")
//    public CommonRes getEastDeadTotals(@RequestBody(required = false) ChartInDto chartInDto) {
//        Map<String,Object> infoList = null;
//        return CommonRes.create(infoList);
//    }
//
//    @PostMapping("/getBuildingDeadTotals")
//    @ApiOperation(value = "获取每栋死亡人口数量")
//    public CommonRes getBuildingDeadTotals(@RequestBody(required = false) ChartInDto chartInDto) {
//        Map<String,Object> infoList = null;
//        return CommonRes.create(infoList);
//    }

    @PostMapping("/queryShequList")
    @ApiOperation(value = "全部所有社区")
    public CommonRes queryShequList() {
        List<String> shequList = charService.queryShequList();
        return CommonRes.create(shequList);
    }


    @PostMapping("/queryOverLookInfo")
    @ApiOperation(value = "获取顶部统计信息,人口,社区,小区,楼栋")
    public CommonRes queryOverLookInfo(@RequestBody(required = false) ChartInDto chartInDto) {
        OverLookInfoOutDto overLookInfoOutDto = charService.queryOverLookInfo(chartInDto);
        return CommonRes.create(overLookInfoOutDto);
    }

    @PostMapping("/queryDisableNum")
    @ApiOperation(value = "残疾人口数量统计")
    public CommonRes queryDisableNum(@RequestBody(required = false) ChartInDto chartInDto) {
        List<TypeValueOutDto> typeValueOutDtos = charService.queryDisableNum(chartInDto);
        return CommonRes.create(typeValueOutDtos);
    }


    @PostMapping("/queryElderPeopleNum")
    @ApiOperation(value = "老年人总数统计")
    public CommonRes queryElderPeopleNum(@RequestBody(required = false) ChartInDto chartInDto) {
        List<TypeValueOutDto> typeValueOutDtos = charService.queryElderPeopleNum(chartInDto);
        return CommonRes.create(typeValueOutDtos);
    }


    @PostMapping("/queryDbhPeopleNum")
    @ApiOperation(value = "低保户统计")
    public CommonRes queryDbhPeopleNum(@RequestBody(required = false) ChartInDto chartInDto) {
        List<TypeValueOutDto> dbhOutDto  = charService.queryDbhPeopleNum(chartInDto);
        return CommonRes.create(dbhOutDto);
    }

    @PostMapping("/queryDistressChildrenNum")
    @ApiOperation(value = "困境儿童统计")
    public CommonRes queryDistressChildrenNum(@RequestBody(required = false) ChartInDto chartInDto) {
        List<TypeValueOutDto> typeValueOutDtos = charService.queryDistressChildrenNum(chartInDto);
        return CommonRes.create(typeValueOutDtos);
    }


    @PostMapping("/queryPeopleTypeNum")
    @ApiOperation(value = "人口类型统计")
    public CommonRes queryPeopleTypeNum(@RequestBody(required = false) ChartInDto chartInDto) {
        List<TypeValueOutDto> typeValueOutDtos = charService.queryPeopleTypeNum(chartInDto);
        return CommonRes.create(typeValueOutDtos);
    }


    /**
     *
     * @param chartInDto
     * @return
     */
    @PostMapping("/queryImportantPeopleNum")
    @ApiOperation(value = "重点人口年统计")
    public CommonRes queryImportantPeopleNum(@RequestBody(required = false) ChartInDto chartInDto) {
        List<TypeValueOutDto> importantPeopleNum = charService.queryImportantPeopleNum(chartInDto);
        return CommonRes.create(importantPeopleNum);
    }


    @PostMapping("/queryImportantPeopleSqNum")
    @ApiOperation(value = "重点人口社区统计")
    public CommonRes queryImportantPeopleSqNum(@RequestBody(required = false) ChartInDto chartInDto) {
        List<TypeValueOutDto> importantPeopleNum = charService.queryImportantPeopleSqNum(chartInDto);
        return CommonRes.create(importantPeopleNum);
    }



}

