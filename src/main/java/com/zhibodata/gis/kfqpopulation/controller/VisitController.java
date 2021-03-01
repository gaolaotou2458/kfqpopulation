package com.zhibodata.gis.kfqpopulation.controller;

import com.zhibodata.gis.kfqpopulation.common.CommonRes;
import com.zhibodata.gis.kfqpopulation.dto.indto.VisitInDto;
import com.zhibodata.gis.kfqpopulation.model.OldPeopleVisit;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 探访记录
 */
@Api(tags = "探访记录")
@RestController
@RequestMapping("/visit")
public class VisitController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ApiOperation(value = "获取探访记录列表")
    public CommonRes getVisitList(@RequestBody(required = false) VisitInDto visitInDto) {
        List<OldPeopleVisit> PartOrgMemberList = null;
        return CommonRes.create(PartOrgMemberList);
    }

    @GetMapping("/getVisitById")
    @ApiOperation(value = "根据id获取探访记录")
    public CommonRes getVisitById(@RequestParam(value = "id") String id) {
        OldPeopleVisit oldPeopleVisit = null;
        return CommonRes.create(oldPeopleVisit);
    }

    @PostMapping("/saveVisit")
    @ApiOperation(value = "保存探访记录信息")
    public CommonRes saveVisit(@RequestBody(required = false) OldPeopleVisit oldPeopleVisit) {
        int i = 0;
        return CommonRes.create(i);
    }

    @PostMapping("/updateVisit")
    @ApiOperation(value = "修改探访记录信息")
    public CommonRes updateVisit(@RequestBody(required = false) OldPeopleVisit oldPeopleVisit) {
        int i = 0;
        return CommonRes.create(i);
    }

    @GetMapping("/deleteVisit")
    @ApiOperation(value = "根据id删除探访记录")
    public CommonRes deleteVisit(@RequestParam(value = "id") String id) {
        int i = 0;
        return CommonRes.create(i);
    }
}
