package com.zhibodata.gis.kfqpopulation.dto.indto.resource;

import cn.hutool.db.Page;
import lombok.Data;

@Data
public class LayerIndto  {


    /**
     * 图层id
     */
    private String layerName;

    /**
     * 身份证号 和 姓名
     */
    private String keyword;


    /**
     * 区域搜索
     */
    private String polygonString;




}
