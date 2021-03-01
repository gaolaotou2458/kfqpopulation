package com.zhibodata.gis.kfqpopulation.mapper;

import com.zhibodata.gis.kfqpopulation.dto.indto.resource.QuerySingleLayerIndto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.map.TpWbhPopulationResponse;
import com.zhibodata.gis.kfqpopulation.model.ViewWbhPopulation;
import com.zhibodata.gis.kfqpopulation.utils.MyMapper;

import java.util.List;

public interface ViewWbhPopulationMapper extends MyMapper<ViewWbhPopulation> {
    Integer queryListCount(QuerySingleLayerIndto inDto);

    List<TpWbhPopulationResponse>  queryList(QuerySingleLayerIndto inDto);
}
