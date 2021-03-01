package com.zhibodata.gis.kfqpopulation.service;

import com.zhibodata.gis.kfqpopulation.dto.indto.SwrkQueryInfoInDto;
import com.zhibodata.gis.kfqpopulation.dto.indto.SwrkQueryListInDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.SwrkPopulationInfoOutDto;

public interface SwrkSearchService {
    RPage querySwrkList(SwrkQueryListInDto inDto);

    SwrkPopulationInfoOutDto querySwrkInfo(SwrkQueryInfoInDto inDto);

}
