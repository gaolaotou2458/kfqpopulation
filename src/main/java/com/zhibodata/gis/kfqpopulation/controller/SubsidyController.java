package com.zhibodata.gis.kfqpopulation.controller;

import com.zhibodata.gis.kfqpopulation.common.CommonRes;
import com.zhibodata.gis.kfqpopulation.dto.indto.search.PersonInDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.search.personOutDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 补贴
 */
@Api(tags = "补贴信息")
@RestController
@RequestMapping("/subsidy")
public class SubsidyController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/getSubsidyPopulationList")
    @ApiOperation(value = "补贴人员列表")
    public CommonRes getSubsidyPopulationList(@RequestBody(required = false) PersonInDto personInDto) {
        List<personOutDto> subsidyPopulationList = null;
        return CommonRes.create(subsidyPopulationList);
    }

    @PostMapping("/checkSubsidy")
    @ApiOperation(value = "补贴校验")
    public CommonRes checkSubsidy(@RequestParam(value = "personCardNumber") String personCardNumber) {
        int i = 0;
        return CommonRes.create(i);
    }
}
