package com.zhibodata.gis.kfqpopulation.service.impl;

import com.zhibodata.gis.kfqpopulation.dto.indto.chart.ChartInDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.*;
import com.zhibodata.gis.kfqpopulation.mapper.CharMapper;
import com.zhibodata.gis.kfqpopulation.service.CharService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CharServiceImpl  implements CharService {

    @Autowired
    private CharMapper charMapper;

    @Override
    public OverLookInfoOutDto queryOverLookInfo(ChartInDto chartInDto) {
        return charMapper.queryOverLookInfo(chartInDto);
    }

    @Override
    public List<String> queryShequList() {
        return charMapper.queryShequList();
    }



    @Override
    public List<TypeValueOutDto> queryDisableNum(ChartInDto chartInDto) {
        return   charMapper.queryDisableNum(chartInDto);
    }

    @Override
    public List<TypeValueOutDto> queryElderPeopleNum(ChartInDto chartInDto) {

        return   charMapper.queryElderPeopleNum(chartInDto);
    }



    @Override
    public  List<TypeValueOutDto> queryDbhPeopleNum(ChartInDto chartInDto) {
        //转一下返回
        DbhChartOutDto dbhChartOutDto = charMapper.queryDbhPeopleNum(chartInDto);
        List<TypeValueOutDto> list = new ArrayList<>();
        list.add(new TypeValueOutDto("女性总数",dbhChartOutDto.getFemaleNum()));
        list.add(new TypeValueOutDto("男性总数",dbhChartOutDto.getMaleNum()));
        list.add(new TypeValueOutDto("总户数",dbhChartOutDto.getTotalHouseNum()));
        list.add(new TypeValueOutDto("人口总数",dbhChartOutDto.getTotalNum()));
        return list;
    }

    @Override
    public List<TypeValueOutDto> queryDistressChildrenNum(ChartInDto chartInDto) {
        return  charMapper.queryDistressChildrenNum(chartInDto);
    }

    @Override
    public List<TypeValueOutDto> queryPeopleTypeNum(ChartInDto chartInDto) {
         return  charMapper.queryPeopleTypeNum(chartInDto);
    }


    /**
     * 需要查询不同的表中过的数据的
     * 这里是根据前端传入时间进行查询
     * @param chartInDto
     * @return
     */
    @Override
    public List<TypeValueOutDto> queryImportantPeopleNum(ChartInDto chartInDto) {
        List<TypeValueOutDto>  typeValueOutDtos  =new ArrayList<>();
        ZdrkPeopleCountNum zdrkPeopleCountNum =  charMapper.queryImportantPeopleNum(chartInDto);
        typeValueOutDtos.add(new TypeValueOutDto("老年人",zdrkPeopleCountNum.getOldPeople()));
        typeValueOutDtos.add(new TypeValueOutDto("残疾人",zdrkPeopleCountNum.getDisabledPoeple()));
        typeValueOutDtos.add(new TypeValueOutDto("低保户",zdrkPeopleCountNum.getDbhNum()));
        typeValueOutDtos.add(new TypeValueOutDto("低保边缘",zdrkPeopleCountNum.getDbbyNum()));
        typeValueOutDtos.add(new TypeValueOutDto("五保户",zdrkPeopleCountNum.getWbhNum()));
        return typeValueOutDtos;
    }

    @Override
    public List<TypeValueOutDto> queryImportantPeopleSqNum(ChartInDto chartInDto) {
        return  charMapper.queryImportantPeopleSqNum(chartInDto);
    }

    
}

