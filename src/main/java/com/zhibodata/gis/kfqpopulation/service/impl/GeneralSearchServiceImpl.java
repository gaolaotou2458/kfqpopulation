package com.zhibodata.gis.kfqpopulation.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhibodata.gis.kfqpopulation.dto.indto.*;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.GeneraYfcrInfoOutDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.general.GeneralHouseMemberInfoOutDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.map.HouseNumberListOutDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.search.ViewTpBasicPopulationOutDto;
import com.zhibodata.gis.kfqpopulation.mapper.CfBuildingMapper;
import com.zhibodata.gis.kfqpopulation.mapper.TpBasicPopulationAllMapper;
import com.zhibodata.gis.kfqpopulation.mapper.TpBasicPopulationMapper;
import com.zhibodata.gis.kfqpopulation.mapper.ViewTpBasicPopulationMapper;
import com.zhibodata.gis.kfqpopulation.model.TpBasicPopulation;
import com.zhibodata.gis.kfqpopulation.model.TpBasicPopulationAll;
import com.zhibodata.gis.kfqpopulation.service.GeneralSearchService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
@CacheConfig(cacheNames = "kfqcache")
public class GeneralSearchServiceImpl implements GeneralSearchService {


    @Autowired
    ViewTpBasicPopulationMapper viewTpBasicPopulationMapper;

    @Autowired
    CfBuildingMapper cfBuildingMapper;


    @Autowired
    TpBasicPopulationAllMapper tpBasicPopulationAllMapper;

    @Autowired
    TpBasicPopulationMapper tpBasicPopulationMapper;



    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public RPage queryPeopleGeneralList(GeneralQueryListInDto inDto) {
        PageHelper.startPage(inDto.getPage(), inDto.getSize());
        Example example2 = new Example(TpBasicPopulation.class);
        Example.Criteria criteria = example2.createCriteria();
        if (StringUtils.isNotBlank(inDto.getAddress())){
            criteria.andLike("hjdz", "%"+inDto.getAddress()+ "%");
        }
        if (StringUtils.isNotBlank(inDto.getXm())){
            criteria.andLike("xm", "%"+inDto.getXm()+"%");
        }
        if (StringUtils.isNotBlank(inDto.getXb())){
            criteria.andEqualTo("xb", inDto.getXb());
        }
        if (StringUtils.isNotBlank(inDto.getSfzh())){
            criteria.andLike("sfzh", "%"+inDto.getSfzh()+"%");
        }
        if (StringUtils.isNotBlank(inDto.getRylx())){
            criteria.andEqualTo("rylx", inDto.getRylx());
        }
        PageInfo<TpBasicPopulation> viewTpBasicPopulationPageInfo = new PageInfo<>(tpBasicPopulationMapper.selectByExample(example2));
        return new RPage(viewTpBasicPopulationPageInfo);
    }

    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public TpBasicPopulationAll queryPeopleGeneralInfo(GeneraQueryInfoInDto inDto) {
        Example example2 = new Example(TpBasicPopulationAll.class);
        if (StringUtils.isNotBlank(inDto.getId())){
            example2.createCriteria().andEqualTo("id", inDto.getId());
        }
        return tpBasicPopulationAllMapper.selectOneByExample(example2);
    }

    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public RPage queryHouseNumberList(GeneralHouseMemberListInDto inDto) {
        PageHelper.startPage(inDto.getPage(), inDto.getSize());
         List<HouseNumberListOutDto> viewTpBasicPopulationPageInfo = cfBuildingMapper.queryHouseNumberList(inDto);
        PageInfo<HouseNumberListOutDto> houseNumberListOutDtoPageInfo = new PageInfo<>(viewTpBasicPopulationPageInfo);
        return  new RPage(houseNumberListOutDtoPageInfo);
    }

    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public RPage queryHouseMemberInfoList(GeneralHouseMemberInfoInDto inDto) {
        PageHelper.startPage(inDto.getPage(), inDto.getSize());
        List<GeneralHouseMemberInfoOutDto>     generalHouseMemberInfoOutDtos  =  cfBuildingMapper.queryHouseHzInfoList(inDto);
        PageInfo<GeneralHouseMemberInfoOutDto> objectPageInfo = new PageInfo<>(generalHouseMemberInfoOutDtos);
        return new RPage<>(objectPageInfo);
    }

    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public RPage queryHouseMemberInfoByHouse(GeneralPeopleMemberInfoInDto inDto) {
        if (StringUtils.isNotBlank(inDto.getHouseAddress())
              || StringUtils.isNotBlank(inDto.getHouseNumber())
              || StringUtils.isNotBlank(inDto.getVillageName())
            ) {
            PageHelper.startPage(inDto.getPage(), inDto.getSize());
            //先根据地名查询一下 建筑id
            PageInfo<ViewTpBasicPopulationOutDto> viewTpBasicPopulationPageInfo = new PageInfo<>(cfBuildingMapper.queryHouseMemberInfoByHouseList(inDto));
            return new RPage<>(viewTpBasicPopulationPageInfo);
        }else {
            Integer count = 2182444;
            List<ViewTpBasicPopulationOutDto> viewTpBasicPopulationOutDtos = cfBuildingMapper.queryHouseMemberInfoByHouseListLimit(inDto);
            return new RPage(count,viewTpBasicPopulationOutDtos,count % inDto.getSize() == 0 ? count / inDto.getSize() : count / inDto.getSize() + 1) ;
        }
    }

    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public RPage queryHouseMemberInfo(GeneraYfcrInfoInDto inDto) {
        PageHelper.startPage(inDto.getPage(), inDto.getSize());
        PageInfo<GeneraYfcrInfoOutDto> generaYfcrInfoOutDtos = new PageInfo<>(cfBuildingMapper.queryHouseMemberInfo(inDto));
        return new RPage(generaYfcrInfoOutDtos);
    }





}
