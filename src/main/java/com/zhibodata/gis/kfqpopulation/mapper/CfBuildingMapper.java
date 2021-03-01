package com.zhibodata.gis.kfqpopulation.mapper;

import com.zhibodata.gis.kfqpopulation.dto.indto.GeneraYfcrInfoInDto;
import com.zhibodata.gis.kfqpopulation.dto.indto.GeneralHouseMemberInfoInDto;
import com.zhibodata.gis.kfqpopulation.dto.indto.GeneralHouseMemberListInDto;
import com.zhibodata.gis.kfqpopulation.dto.indto.GeneralPeopleMemberInfoInDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.GeneraYfcrInfoOutDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.GeneralHouseMemberInfoOutDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.map.HouseNumberListOutDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.search.ViewTpBasicPopulationOutDto;
import com.zhibodata.gis.kfqpopulation.model.CfBuilding;
import com.zhibodata.gis.kfqpopulation.model.ViewTpBasicPopulation;
import com.zhibodata.gis.kfqpopulation.utils.MyMapper;

import java.util.List;

public interface CfBuildingMapper extends MyMapper<CfBuilding> {

    List<HouseNumberListOutDto> queryHouseNumberList(GeneralHouseMemberListInDto inDto);

    Integer queryHouseNumberCount(GeneralHouseMemberListInDto inDto);


    List<GeneralHouseMemberInfoOutDto> queryHouseHzInfoList(GeneralHouseMemberInfoInDto inDto);

    List<ViewTpBasicPopulationOutDto> queryHouseMemberInfoByHouseList(GeneralPeopleMemberInfoInDto inDto);

    List<ViewTpBasicPopulationOutDto> queryHouseMemberInfoByHouseListLimit(GeneralPeopleMemberInfoInDto inDto);

    List<GeneraYfcrInfoOutDto> queryHouseMemberInfo(GeneraYfcrInfoInDto inDto);
}
