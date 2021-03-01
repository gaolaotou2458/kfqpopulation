package com.zhibodata.gis.kfqpopulation.mapper;

import com.zhibodata.gis.kfqpopulation.dto.indto.SwrkQueryInfoInDto;
import com.zhibodata.gis.kfqpopulation.dto.indto.SwrkQueryListInDto;
import com.zhibodata.gis.kfqpopulation.dto.indto.resource.QueryMapLayerIndto;
import com.zhibodata.gis.kfqpopulation.dto.indto.resource.QuerySingleLayerIndto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.SwrkPopulationInfoOutDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.map.SwrkPopulationResponse;
import com.zhibodata.gis.kfqpopulation.model.SwrkPopulation;
import com.zhibodata.gis.kfqpopulation.model.ViewTpBasicPopulation;
import com.zhibodata.gis.kfqpopulation.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SwrkPopulationMapper extends MyMapper<SwrkPopulation> {

    Integer queryListCount(QuerySingleLayerIndto inDto);

    List<SwrkPopulationResponse> queryList(@Param("keyword") String keyword, @Param("polygonString") String polygonString, @Param("page") Integer page, @Param("size") Integer size);

    Integer querySwrkBuildingCount(QueryMapLayerIndto indto);


    List<ViewTpBasicPopulation> queryZdrkBuildingList(QueryMapLayerIndto indto);

    List<SwrkPopulationResponse>  querySwrkList(SwrkQueryListInDto inDto);

    SwrkPopulationInfoOutDto querySwrkInfo(SwrkQueryInfoInDto inDto);
}
