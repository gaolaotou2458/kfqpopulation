package com.zhibodata.gis.kfqpopulation.mapper;

import com.zhibodata.gis.kfqpopulation.dto.indto.Page;
import com.zhibodata.gis.kfqpopulation.dto.outdto.map.CfShequResponse;
import com.zhibodata.gis.kfqpopulation.model.CfShequ;
import com.zhibodata.gis.kfqpopulation.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CfShequMapper extends MyMapper<CfShequ> {


    List<CfShequResponse> queryList(@Param("keyword") String keyword, @Param("polygonString") String polygonString, @Param("page") Integer page,@Param("size") Integer size);

    Integer queryListCount(@Param("keyword") String keyword, @Param("polygonString") String polygonString, @Param("page") Integer page,@Param("size") Integer size);
}
