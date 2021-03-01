package com.zhibodata.gis.kfqpopulation.mapper;

import com.zhibodata.gis.kfqpopulation.dto.indto.resource.QuerySingleLayerIndto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.map.TpDisablePopulationResponse;
import com.zhibodata.gis.kfqpopulation.model.ViewDisabledPopulation;
import com.zhibodata.gis.kfqpopulation.utils.MyMapper;

import java.util.List;

public interface ViewDisabledPopulationMapper extends MyMapper<ViewDisabledPopulation> {
    Integer queryListCount(QuerySingleLayerIndto inDto);

    List<TpDisablePopulationResponse> queryList(QuerySingleLayerIndto inDto);
}
