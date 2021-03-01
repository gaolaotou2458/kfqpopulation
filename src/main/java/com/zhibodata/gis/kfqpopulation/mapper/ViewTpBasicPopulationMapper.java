package com.zhibodata.gis.kfqpopulation.mapper;

import com.zhibodata.gis.kfqpopulation.dto.indto.Page;
import com.zhibodata.gis.kfqpopulation.dto.indto.resource.QueryMapLayerIndto;
import com.zhibodata.gis.kfqpopulation.dto.indto.resource.QueryPersonListByhhIndto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.map.TpBasicPopulationResponse;
import com.zhibodata.gis.kfqpopulation.dto.outdto.map.TpBasicPopulationWithTypeOutDto;
import com.zhibodata.gis.kfqpopulation.model.ViewTpBasicPopulation;
import com.zhibodata.gis.kfqpopulation.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ViewTpBasicPopulationMapper extends MyMapper<ViewTpBasicPopulation> {

    Integer queryZrkBuildingCount(QueryMapLayerIndto indto);

    List<ViewTpBasicPopulation> queryZrkBuildingList(QueryMapLayerIndto indto);

    Integer queryZdrkBuildingCount(QueryMapLayerIndto indto);

    List<ViewTpBasicPopulation> queryZdrkBuildingList(QueryMapLayerIndto indto);

    Integer queryAllListCount(@Param("id") String id, @Param("keyword") String keyword, @Param("polygonString") String polygonString, @Param("page") Integer page, @Param("size") Integer size);

    List<TpBasicPopulationResponse> queryAllList(@Param("id") String id, @Param("keyword") String keyword, @Param("polygonString") String polygonString, @Param("page") Integer page, @Param("size") Integer size);

    List<TpBasicPopulationWithTypeOutDto> selectFamilyInfoList(QueryPersonListByhhIndto queryPersonListByhhIndto);
}
