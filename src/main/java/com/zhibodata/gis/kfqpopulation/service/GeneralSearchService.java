package com.zhibodata.gis.kfqpopulation.service;

import com.zhibodata.gis.kfqpopulation.dto.indto.*;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;
import com.zhibodata.gis.kfqpopulation.dto.outdto.map.HouseNumberInfoOutDto;
import com.zhibodata.gis.kfqpopulation.model.TpBasicPopulationAll;
import com.zhibodata.gis.kfqpopulation.model.ViewTpBasicPopulation;

import java.util.List;

/**
 * @author chenxiyao
 */
public interface GeneralSearchService {
    RPage queryPeopleGeneralList(GeneralQueryListInDto inDto);

    TpBasicPopulationAll queryPeopleGeneralInfo(GeneraQueryInfoInDto inDto);

    RPage queryHouseNumberList(GeneralHouseMemberListInDto inDto);


    RPage queryHouseMemberInfoList(GeneralHouseMemberInfoInDto inDto);

    RPage queryHouseMemberInfoByHouse(GeneralPeopleMemberInfoInDto inDto);

    RPage queryHouseMemberInfo(GeneraYfcrInfoInDto inDto);
}
