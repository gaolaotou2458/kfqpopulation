package com.zhibodata.gis.kfqpopulation.mapper;

import com.zhibodata.gis.kfqpopulation.dto.indto.chart.ChartInDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.*;

import java.util.List;

public interface CharMapper  {


    List<String> queryShequList();

    OverLookInfoOutDto queryOverLookInfo(ChartInDto chartInDto);

    List<TypeValueOutDto> queryDisableNum(ChartInDto chartInDto);

    List<TypeValueOutDto> queryElderPeopleNum(ChartInDto chartInDto);

    DbhChartOutDto queryDbhPeopleNum(ChartInDto chartInDto);

    List<TypeValueOutDto> queryDistressChildrenNum(ChartInDto chartInDto);

    List<TypeValueOutDto> queryPeopleTypeNum(ChartInDto chartInDto);

    ZdrkPeopleCountNum queryImportantPeopleNum(ChartInDto chartInDto);

    List<TypeValueOutDto> queryImportantPeopleSqNum(ChartInDto chartInDto);
}
