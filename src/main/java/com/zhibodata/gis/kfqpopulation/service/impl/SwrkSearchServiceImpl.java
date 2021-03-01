package com.zhibodata.gis.kfqpopulation.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhibodata.gis.kfqpopulation.dto.indto.SwrkQueryInfoInDto;
import com.zhibodata.gis.kfqpopulation.dto.indto.SwrkQueryListInDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.SwrkPopulationInfoOutDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.map.SwrkPopulationResponse;
import com.zhibodata.gis.kfqpopulation.mapper.SwrkPopulationMapper;
import com.zhibodata.gis.kfqpopulation.service.SwrkSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "kfqcache")
public class SwrkSearchServiceImpl  implements SwrkSearchService {

    @Autowired
    private SwrkPopulationMapper swrkPopulationMapper;


    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public RPage querySwrkList(SwrkQueryListInDto inDto) {
        PageHelper.startPage(inDto.getPage(), inDto.getSize());
        List<SwrkPopulationResponse> swrkPopulationResponses = swrkPopulationMapper.querySwrkList(inDto);
        PageInfo<SwrkPopulationResponse> swrkPopulationResponsePageInfo = new PageInfo<>(swrkPopulationResponses);
        return new RPage(swrkPopulationResponsePageInfo);
    }

    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public SwrkPopulationInfoOutDto querySwrkInfo(SwrkQueryInfoInDto inDto) {
        return swrkPopulationMapper.querySwrkInfo(inDto);
    }
}
