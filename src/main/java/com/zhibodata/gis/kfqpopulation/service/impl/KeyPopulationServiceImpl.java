package com.zhibodata.gis.kfqpopulation.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhibodata.gis.kfqpopulation.Codes.KEYPOPULATION;
import com.zhibodata.gis.kfqpopulation.dto.indto.Page;
import com.zhibodata.gis.kfqpopulation.dto.indto.search.KeyPopulation.DetailInDto;
import com.zhibodata.gis.kfqpopulation.dto.indto.search.KeyPopulation.PopulationCommonSearchInDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;
import com.zhibodata.gis.kfqpopulation.dto.outdto.search.PopulationCommonOutDto;
import com.zhibodata.gis.kfqpopulation.mapper.*;
import com.zhibodata.gis.kfqpopulation.model.*;
import com.zhibodata.gis.kfqpopulation.service.KeyPopulationService;
import com.zhibodata.gis.kfqpopulation.utils.MyMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * @author : WangFan
 * create at:  2020/11/13  9:37 AM
 * @ClassName KeyPopulationServiceImpl
 * @description:
 * @Version 1.0
 */
@Service
@Slf4j
@CacheConfig(cacheNames = "kfqcache")
public class KeyPopulationServiceImpl implements KeyPopulationService {


    @Autowired
    private ViewElderlyPopulationMapper viewElderlyPopulationMapper;

    @Autowired
    private ViewDisabledPopulationMapper viewDisabledPopulationMapper;

    @Autowired
    private ViewDbhPopulationMapper viewDbhPopulationMapper;

    @Autowired
    private ViewDbbyPopulationMapper viewDbbyPopulationMapper;

    @Autowired
    private ViewWbhPopulationMapper viewWbhPopulationMapper;


    private Map<String, Function> map = new HashMap<String, Function>() {
        {
            put(KEYPOPULATION.ELDERLYPOPUTION.name(), (page, inDto) -> queryElderlyPopulationWithPage(page, inDto));

            put(KEYPOPULATION.DISABLEPOPUTION.name(), (page, inDto) -> queryDisabledPopulationWithPage(page, inDto));

            put(KEYPOPULATION.DBPOPUTION.name(), (page, inDto) -> queryDbhPopulationWithPage(page, inDto));

            put(KEYPOPULATION.DBBYPOPUTION.name(), (page, inDto) -> queryDbbyPopulationWithPage(page, inDto));

            put(KEYPOPULATION.WBPOPULATION.name(), (page, inDto) -> queryWbhPopulationWithPage(page, inDto));


        }
    };
    private Map<String, DetailFunction> detailMap = new HashMap<String, DetailFunction>() {
        {
            put(KEYPOPULATION.ELDERLYPOPUTION_DETAIL.name(), inDto -> queryDetail(inDto, ViewElderlyPopulation.class, viewElderlyPopulationMapper));

            put(KEYPOPULATION.DISABLEPOPUTION_DETAIL.name(), inDto -> queryDetail(inDto, ViewDisabledPopulation.class, viewDisabledPopulationMapper));

            put(KEYPOPULATION.DBPOPUTION_DETAIL.name(), inDto -> queryDetail(inDto, ViewDbhPopulation.class, viewDbhPopulationMapper));

            put(KEYPOPULATION.DBBYPOPUTION_DETAIL.name(), inDto -> queryDetail(inDto, ViewDbbyPopulation.class, viewDbbyPopulationMapper));

            put(KEYPOPULATION.WBPOPULATION_DETAIL.name(), inDto -> queryDetail(inDto, ViewWbhPopulation.class, viewWbhPopulationMapper));


        }
    };

    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public RPage queryKeyPopulationWithPage(Page page, PopulationCommonSearchInDto inDto) {
        log.info("分页查询 {}", inDto.getType());
        if (this.map.containsKey(inDto.getType())) {
            return map.get(inDto.getType()).execute(page, inDto);
        }
        return new RPage(new PageInfo());
    }

    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public List queryDetail(DetailInDto inDto) {
        log.info("查询 {}详细信息,id为:{}", inDto.getType(), inDto.getId());
        if (this.detailMap.containsKey(inDto.getType())) {
            return detailMap.get(inDto.getType()).execute(inDto);
        }
        return new ArrayList();
    }


    private List queryDetail(DetailInDto inDto, Class<?> classType, MyMapper myMapper) {
        Example example = new Example(classType);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(inDto.getId())) {
            criteria.andEqualTo("id", inDto.getId());
        }
        if (null  !=inDto.getAgeStart() ) {
            criteria.andGreaterThanOrEqualTo("age", inDto.getAgeStart());
        }
        if (null  !=inDto.getAgeEnd() ) {
            criteria.andLessThanOrEqualTo("age", inDto.getAgeEnd());
        }
        return myMapper.selectByExample(example);
    }

    private RPage queryElderlyPopulationWithPage(Page page, PopulationCommonSearchInDto inDto) {

        PageHelper.startPage(inDto.getPage(), inDto.getSize());
        Example example = new Example(ViewElderlyPopulation.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(inDto.getSfzh())) {
            criteria.andLike("sfzh", "%" + inDto.getSfzh() + "%");
        }
        if (StringUtils.isNotBlank(inDto.getXm())) {
            criteria.andLike("xm","%" + inDto.getXm() + "%");
        }
        List<ViewElderlyPopulation> viewElderlyPopulations = viewElderlyPopulationMapper.selectByExample(example);
        PageInfo<ViewElderlyPopulation> pageInfo = new PageInfo<>(viewElderlyPopulations);


//        List<PopulationCommonOutDto> collect = viewElderlyPopulations.parallelStream().map(PopulationCommonOutDto::new).collect(Collectors.toList());
//        PageInfo<PopulationCommonOutDto> pageInfo1 = new PageInfo<>(collect);
        return new RPage(pageInfo);
    }

    private RPage queryDisabledPopulationWithPage(Page page, PopulationCommonSearchInDto inDto) {

        PageHelper.startPage(inDto.getPage(), inDto.getSize());
        Example example = new Example(ViewDisabledPopulation.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(inDto.getSfzh())) {
            criteria.andLike("sfzh", "%" + inDto.getSfzh()+ "%" );
        }
        if (StringUtils.isNotBlank(inDto.getXm())) {
            criteria.andLike("xm","%" +  inDto.getXm() + "%" );
        }
//        PageInfo<PopulationCommonOutDto> pageInfo = new PageInfo<>(viewDisabledPopulationMapper.selectByExample(example).parallelStream()
//                .map(PopulationCommonOutDto::new).collect(Collectors.toList()));
        PageInfo<ViewDisabledPopulation> viewDisabledPopulationPageInfo = new PageInfo<>(viewDisabledPopulationMapper.selectByExample(example));
        return new RPage(viewDisabledPopulationPageInfo);
    }

    private RPage queryDbhPopulationWithPage(Page page, PopulationCommonSearchInDto inDto) {

        PageHelper.startPage(inDto.getPage(), inDto.getSize());
        Example example = new Example(ViewDbhPopulation.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(inDto.getSfzh())) {
            criteria.andLike("sfzh", "%" +inDto.getSfzh() +  "%");
        }
        if (StringUtils.isNotBlank(inDto.getXm())) {
            criteria.andLike("xm", "%" + inDto.getXm() + "%");
        }
//        PageInfo<PopulationCommonOutDto> pageInfo = new PageInfo<>(viewDbhPopulationMapper.selectByExample(example).parallelStream()
//                .map(PopulationCommonOutDto::new).collect(Collectors.toList()));
        PageInfo<ViewDbhPopulation> viewDbhPopulationPageInfo = new PageInfo<>(viewDbhPopulationMapper.selectByExample(example));
        return new RPage(viewDbhPopulationPageInfo);
    }

    private RPage queryDbbyPopulationWithPage(Page page, PopulationCommonSearchInDto inDto) {

        PageHelper.startPage(inDto.getPage(), inDto.getSize());
        Example example = new Example(ViewDbbyPopulation.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(inDto.getSfzh())) {
            criteria.andLike("sfzh", inDto.getSfzh());
        }
        if (StringUtils.isNotBlank(inDto.getXm())) {
            criteria.andLike("xm", "%" + inDto.getXm() + "%");
        }
        example.setOrderByClause("xm desc");
//        PageInfo<PopulationCommonOutDto> pageInfo = new PageInfo<>(viewDbbyPopulationMapper.selectByExample(example).parallelStream()
//                .map(PopulationCommonOutDto::new).collect(Collectors.toList()));
        PageInfo<ViewDbbyPopulation> viewDbbyPopulationPageInfo = new PageInfo<>(viewDbbyPopulationMapper.selectByExample(example));
        return new RPage(viewDbbyPopulationPageInfo);
    }

    private RPage queryWbhPopulationWithPage(Page page, PopulationCommonSearchInDto inDto) {

        PageHelper.startPage(inDto.getPage(), inDto.getSize());
        Example example = new Example(ViewWbhPopulation.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(inDto.getSfzh())) {
            criteria.andLike("sfzh", "%" + inDto.getSfzh() + "%");
        }
        if (StringUtils.isNotBlank(inDto.getXm())) {
            criteria.andLike("xm",  "%" + inDto.getXm() +  "%");
        }
//        PageInfo<PopulationCommonOutDto> pageInfo = new PageInfo<>(viewWbhPopulationMapper.selectByExample(example).parallelStream()
//                .map(PopulationCommonOutDto::new).collect(Collectors.toList()));
        PageInfo<ViewWbhPopulation> viewWbhPopulationPageInfo = new PageInfo<>(viewWbhPopulationMapper.selectByExample(example));
        return new RPage(viewWbhPopulationPageInfo);
    }

    @FunctionalInterface
    private interface Function {
        RPage execute(Page page, PopulationCommonSearchInDto inDto);

    }

    @FunctionalInterface
    private interface DetailFunction {
        List execute(DetailInDto detailInDto);

    }





}
