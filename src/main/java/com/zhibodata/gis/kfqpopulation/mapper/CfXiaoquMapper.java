package com.zhibodata.gis.kfqpopulation.mapper;

import com.zhibodata.gis.kfqpopulation.dto.outdto.map.CfXiaoquResponse;
import com.zhibodata.gis.kfqpopulation.model.CfXiaoqu;
import com.zhibodata.gis.kfqpopulation.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CfXiaoquMapper extends MyMapper<CfXiaoqu> {
    List<CfXiaoquResponse> queryList(@Param("id")String id, @Param("keyword") String keyword, @Param("polygonString") String polygonString, @Param("page") Integer page, @Param("size") Integer size);

    Integer queryListCount(@Param("id")String id,  @Param("keyword")String keyword, @Param("polygonString") String polygonString, @Param("page") Integer page, @Param("size") Integer size);

}
