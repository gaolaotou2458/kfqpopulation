package com.zhibodata.gis.kfqpopulation.service;

import cn.hutool.core.lang.tree.Tree;
import com.zhibodata.gis.kfqpopulation.dto.indto.resource.*;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage2;
import com.zhibodata.gis.kfqpopulation.dto.outdto.map.TpBasicPopulationWithTypeOutDto;
import com.zhibodata.gis.kfqpopulation.model.ViewTpBasicPopulation;

import java.util.List;
import java.util.Map;

public interface SysService {
    List<Tree<String>> queryAllLayerResource();


    FeatureEntity querySelectedLayer(QuerySelectedLayerIndto querySelectedLayerIndto);

    RPage2 querySingleLayerList(QuerySingleLayerIndto singleLayerIndto);

    List<Map<String,Object>> queryBuildingSum(QueryMapLayerIndto indto);

    RPage queryBuildingList(QueryMapLayerIndto buildingId);

    List<TpBasicPopulationWithTypeOutDto> queryPersonListByhh(QueryPersonListByhhIndto queryPersonListByhhIndto);

}
