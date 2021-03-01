package com.zhibodata.gis.kfqpopulation.mapper;

import com.zhibodata.gis.kfqpopulation.dto.indto.resource.QuerySingleLayerIndto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.map.ViewDbbyPopulationResponse;
import com.zhibodata.gis.kfqpopulation.model.ViewDbbyPopulation;
import com.zhibodata.gis.kfqpopulation.utils.MyMapper;

import java.util.List;

public interface ViewDbbyPopulationMapper extends MyMapper<ViewDbbyPopulation> {
    Integer queryListCount(QuerySingleLayerIndto inDto);

    List<ViewDbbyPopulationResponse> queryList(QuerySingleLayerIndto inDto);
}
