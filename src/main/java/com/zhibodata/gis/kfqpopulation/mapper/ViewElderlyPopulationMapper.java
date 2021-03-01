package com.zhibodata.gis.kfqpopulation.mapper;

import com.zhibodata.gis.kfqpopulation.dto.outdto.map.TpBasicPopulationResponse;
import com.zhibodata.gis.kfqpopulation.model.ViewElderlyPopulation;
import com.zhibodata.gis.kfqpopulation.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ViewElderlyPopulationMapper extends MyMapper<ViewElderlyPopulation> {

    Integer queryListCount(@Param("id") String id, @Param("keyword") String keyword, @Param("polygonString") String polygonString, @Param("page") Integer page, @Param("size") Integer size);

    List<TpBasicPopulationResponse> queryList(@Param("id") String id, @Param("keyword") String keyword, @Param("polygonString") String polygonString, @Param("page") Integer page, @Param("size") Integer size);
}
