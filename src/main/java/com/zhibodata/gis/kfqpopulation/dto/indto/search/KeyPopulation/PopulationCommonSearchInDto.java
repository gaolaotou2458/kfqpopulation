package com.zhibodata.gis.kfqpopulation.dto.indto.search.KeyPopulation;

import com.zhibodata.gis.kfqpopulation.dto.indto.Pin;
import com.zhibodata.gis.kfqpopulation.dto.indto.PinWithPage;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : WangFan
 * create at:  2020/11/13  2:30 PM
 * @ClassName ElderlyPopulationInDto
 * @description:
 * @Version 1.0
 */
@Getter
@Setter
public class PopulationCommonSearchInDto extends PinWithPage {

    private String sfzh;

    private String xm;

    private String type;
}
