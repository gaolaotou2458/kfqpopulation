package com.zhibodata.gis.kfqpopulation.mapper;

import com.zhibodata.gis.kfqpopulation.dto.indto.resource.QuerySingleLayerIndto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.map.TpDbhPopulationResponse;
import com.zhibodata.gis.kfqpopulation.model.ViewDbhPopulation;
import com.zhibodata.gis.kfqpopulation.utils.MyMapper;

import java.util.List;

public interface ViewDbhPopulationMapper extends MyMapper<ViewDbhPopulation> {

    Integer queryListCount(QuerySingleLayerIndto inDto);

    List<TpDbhPopulationResponse> queryList(QuerySingleLayerIndto inDto);

}
