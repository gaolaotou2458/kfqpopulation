package com.zhibodata.gis.kfqpopulation.service;

import com.zhibodata.gis.kfqpopulation.dto.indto.chart.ChartInDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.DbhChartOutDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.ImportantPeopleNumOutDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.TypeValueOutDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.OverLookInfoOutDto;

import java.util.List;

public interface CharService {

    OverLookInfoOutDto queryOverLookInfo(ChartInDto chartInDto);

    List<String> queryShequList();


    List<TypeValueOutDto> queryDisableNum(ChartInDto chartInDto);

    List<TypeValueOutDto> queryElderPeopleNum(ChartInDto chartInDto);

    List<TypeValueOutDto> queryDbhPeopleNum(ChartInDto chartInDto);

    List<TypeValueOutDto> queryDistressChildrenNum(ChartInDto chartInDto);

    List<TypeValueOutDto> queryPeopleTypeNum(ChartInDto chartInDto);

    List<TypeValueOutDto> queryImportantPeopleNum(ChartInDto chartInDto);

    List<TypeValueOutDto> queryImportantPeopleSqNum(ChartInDto chartInDto);
}
