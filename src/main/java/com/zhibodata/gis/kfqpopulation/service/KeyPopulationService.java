package com.zhibodata.gis.kfqpopulation.service;

import com.zhibodata.gis.kfqpopulation.dto.indto.Page;
import com.zhibodata.gis.kfqpopulation.dto.indto.search.KeyPopulation.DetailInDto;
import com.zhibodata.gis.kfqpopulation.dto.indto.search.KeyPopulation.PopulationCommonSearchInDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;

import java.util.List;

/**
 * @author : WangFan
 * create at:  2020/11/13  9:37 AM
 * @ClassName KeyPopulationService
 * @description:
 * @Version 1.0
 */
public interface KeyPopulationService {

    RPage queryKeyPopulationWithPage(Page page, PopulationCommonSearchInDto inDto);

    List queryDetail(DetailInDto inDto);


}
