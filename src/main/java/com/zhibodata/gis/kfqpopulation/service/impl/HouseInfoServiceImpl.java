package com.zhibodata.gis.kfqpopulation.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhibodata.gis.kfqpopulation.dto.indto.HouseInDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;
import com.zhibodata.gis.kfqpopulation.dto.outdto.search.PopulationCommonOutDto;
import com.zhibodata.gis.kfqpopulation.mapper.CfBuildingMapper;
import com.zhibodata.gis.kfqpopulation.mapper.CfJianzhuMapper;
import com.zhibodata.gis.kfqpopulation.model.CfBuilding;
import com.zhibodata.gis.kfqpopulation.model.CfJianzhu;
import com.zhibodata.gis.kfqpopulation.service.HouseInfoService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.stream.Collectors;

@Service
@CacheConfig(cacheNames = "kfqcache")
public class HouseInfoServiceImpl implements HouseInfoService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CfBuildingMapper cfBuildingMapper;



    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public RPage queryHouseList(HouseInDto inDto) {
        PageHelper.startPage(inDto.getPage(), inDto.getSize());
        Example example = new Example(CfBuilding.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(inDto.getNumber())) {
            criteria.andLike("number", inDto.getNumber());
        }
        if (StringUtils.isNotBlank(inDto.getName())) {
            criteria.andLike("name", "%"+inDto.getName()+"%");
        }
        if (StringUtils.isNotBlank(inDto.getAddress())) {
            criteria.andLike("address", "%"+inDto.getAddress()+"%");
        }
        example.setOrderByClause("name asc");
        PageInfo<CfBuilding> cfJianzhuPageInfo = new PageInfo<>(cfBuildingMapper.selectByExample(example));
        return new RPage(cfJianzhuPageInfo);
    }

    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public CfBuilding queryHouseInfo(String id) {
        CfBuilding cfBuilding = cfBuildingMapper.selectByPrimaryKey(id);
        return cfBuilding;
    }
}
