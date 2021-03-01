package com.zhibodata.gis.kfqpopulation.dto.outdto.map;

import com.zhibodata.gis.kfqpopulation.model.ViewTpBasicPopulation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class QueryMapLayerOutdto {

    @ApiModelProperty(notes = "流动人口总数")
    private List<Map<String,Object>> ldrk;

    @ApiModelProperty(notes = "重点人口总数")
    private Map<String,Object> zdrk;

    @ApiModelProperty(notes = "死亡人口")
    private Map<String,Object> swrk;

}
