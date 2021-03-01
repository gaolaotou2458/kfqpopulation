package com.zhibodata.gis.kfqpopulation.dto.indto.resource;

import lombok.Data;

import java.util.List;

@Data
public class QuerySelectedLayerOutdto {



    /**
     * 大于60岁的图层
     */
    private FeatureEntity over60;

    /**
     * 大于80岁的图层
     */
    private FeatureEntity over80;

    /**
     * 大于100岁的图层
     */
    private FeatureEntity over100;

    /**
     * 残疾人图层
     */
    private FeatureEntity  disabledLayer;

    /**
     * 低保户图层
     */
    private FeatureEntity  dbhLayer;

    /**
     * 五保户图层
     */
    private FeatureEntity  wbhLayer;
    /**
     * 低保边缘图层
     */
    private FeatureEntity  dbbyLayer;

    /**
     * 社区图层
     */
    private FeatureEntity  sqLayer;

    /**
     * 小区图层
     */
    private FeatureEntity  xqLayer;






}
