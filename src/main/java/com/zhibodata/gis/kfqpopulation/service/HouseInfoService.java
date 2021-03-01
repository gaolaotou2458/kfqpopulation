package com.zhibodata.gis.kfqpopulation.service;

import com.zhibodata.gis.kfqpopulation.dto.indto.HouseInDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;
import com.zhibodata.gis.kfqpopulation.model.CfBuilding;
import com.zhibodata.gis.kfqpopulation.model.CfJianzhu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public interface HouseInfoService {


    RPage queryHouseList(HouseInDto houseInDto);

    CfBuilding queryHouseInfo(String id);
}
