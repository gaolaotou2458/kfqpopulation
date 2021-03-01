package com.zhibodata.gis.kfqpopulation.service.impl;

import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNodeConfig;
import cn.hutool.core.lang.tree.TreeUtil;
import com.alibaba.fastjson.JSON;
import com.zhibodata.gis.kfqpopulation.dto.indto.resource.*;
import com.zhibodata.gis.kfqpopulation.dto.indto.search.KeyPopulation.DetailInDto;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage2;
import com.zhibodata.gis.kfqpopulation.dto.outdto.map.BaseJsonResponse;
import com.zhibodata.gis.kfqpopulation.dto.outdto.map.TpBasicPopulationWithTypeOutDto;
import com.zhibodata.gis.kfqpopulation.mapper.*;
import com.zhibodata.gis.kfqpopulation.model.*;
import com.zhibodata.gis.kfqpopulation.service.KeyPopulationService;
import com.zhibodata.gis.kfqpopulation.service.SysService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@CacheConfig(cacheNames = "kfqcache")
public class SysServiceImpl implements SysService {

    @Autowired
    private ResourceLayerMapper resourceLayerMapper;

    @Autowired
    private KeyPopulationService keyPopulationService;

    @Autowired
    private CfShequMapper cfShequMapper;

    @Autowired
    private CfXiaoquMapper cfXiaoquMapper;

    @Autowired
    private CfJianzhuMapper cfJianzhuMapper;

    @Autowired
    private ViewTpBasicPopulationMapper viewTpBasicPopulationMapper;

    @Autowired
    private ViewElderlyPopulationMapper viewElderlyPopulationMapper;

    @Autowired
    private SwrkPopulationMapper swrkPopulationMapper;

    @Autowired
    private ViewDisabledPopulationMapper viewDisabledPopulationMapper;

    @Autowired
    private ViewDbhPopulationMapper viewDbhPopulationMapper;

    @Autowired
    private ViewDbbyPopulationMapper viewDbbyPopulationMapper;

    @Autowired
    private ViewWbhPopulationMapper viewWbhPopulationMapper;


    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public  List<Tree<String>> queryAllLayerResource() {
        List<ResourceLayer> resourceLayers = resourceLayerMapper.selectAll();
        //使用hutool工具生成树形结构
        TreeNodeConfig treeNodeConfig = new TreeNodeConfig();
        // 自定义属性名 都有默认值的哈
        // 默认支持排序
        treeNodeConfig.setWeightKey("orderNum");
        treeNodeConfig.setChildrenKey("children");
        //可配置树深度
        treeNodeConfig.setDeep(2);
        treeNodeConfig.setIdKey("id");
        //转换器
        List<Tree<String>> treeList = TreeUtil.build(resourceLayers, "0", treeNodeConfig,
                (treeNode, tree) -> {
                    tree.setId(treeNode.getId());
                    tree.setParentId(treeNode.getParentId());
                    tree.setWeight(treeNode.getSortNum());
                    tree.setName(treeNode.getName());
                    // 扩展属性
                    tree.putExtra("icon", treeNode.getIcon());
                    tree.putExtra("disabled", treeNode.getDisabled());
                    tree.putExtra("propertyName", treeNode.getPropertyName());
                    tree.putExtra("searchabled", treeNode.getSearchabled());
                    tree.putExtra("subLayerId", treeNode.getSubLayerId());
                    tree.putExtra("subLayerName", treeNode.getSubLayerName());
                    tree.putExtra("layerZoom", treeNode.getLayerZoom());
                    tree.putExtra("layerType", treeNode.getLayerType());
                });
        return treeList;
    }

    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public FeatureEntity querySelectedLayer(QuerySelectedLayerIndto querySelectedLayerIndto) {
//        QuerySelectedLayerOutdto querySelectedLayerOutdto = new QuerySelectedLayerOutdto();
        String layerId = querySelectedLayerIndto.getLayerList();
        //根据key去取不同的数据
            switch (layerId){
                // key 60- 80
                case "94b1de88-db25-46c7-afb9-05dcaa7221b9":
                    DetailInDto detailInDto = new DetailInDto("ELDERLYPOPUTION_DETAIL", 60, 80);
                    FeatureEntity featureEntity = transPoint(keyPopulationService.queryDetail(detailInDto));
                    return featureEntity;
//                    querySelectedLayerOutdto.setOver60(featureEntity);

//                    querySelectedLayerOutdto.setOver80(featureEntity1);
                case "704708ac-25bd-4dff-87aa-bf537264dc34":
                    // key 80 - 90
                    DetailInDto detailInDto1 = new DetailInDto("ELDERLYPOPUTION_DETAIL", 80, 90);
                    FeatureEntity featureEntity1 = transPoint(keyPopulationService.queryDetail(detailInDto1));
                    return featureEntity1;
//                    querySelectedLayerOutdto.setOver80(featureEntity1);
                case "797ffe74-b3dc-4fb6-b7b8-55bd07d7fc10":
                    // key 90 - 100
                    DetailInDto detailInDto11 = new DetailInDto("ELDERLYPOPUTION_DETAIL", 90, 100);
                    FeatureEntity featureEntity11 = transPoint(keyPopulationService.queryDetail(detailInDto11));
                    return featureEntity11;
                case "e2ba89c3-f4bf-4098-968c-4f0c9fe9e3ab":
                    // key 100 -
                    DetailInDto detailInDto2 = new DetailInDto("ELDERLYPOPUTION_DETAIL", 100, null);
                    FeatureEntity featureEntity2 = transPoint(keyPopulationService.queryDetail(detailInDto2));
                    return featureEntity2;
//                    querySelectedLayerOutdto.setOver100(featureEntity2);
                case "d9f5a85e-da95-4ba2-ad38-532fa5815ed6":
                    // key 残疾人 -
                    DetailInDto detailInDto3 = new DetailInDto("DISABLEPOPUTION_DETAIL");
                    FeatureEntity featureEntity3 = transPoint(keyPopulationService.queryDetail(detailInDto3));
                    return featureEntity3;
//                    querySelectedLayerOutdto.setDisabledLayer(featureEntity3);
                case "23026fae-4670-4864-af9c-e1951120bd17":
                    // key 低保 -
                    DetailInDto detailInDto4 = new DetailInDto("DBPOPUTION_DETAIL");
                    FeatureEntity featureEntity4 = transPoint(keyPopulationService.queryDetail(detailInDto4));
                    return featureEntity4;
//                    querySelectedLayerOutdto.setDbhLayer(featureEntity4);
                case "1ddf3722-56db-4733-b57f-68c2443e61cf":
                    // key 五保户 -
                    DetailInDto detailInDto5 = new DetailInDto("WBPOPULATION_DETAIL");
                    FeatureEntity featureEntity5 = transPoint(keyPopulationService.queryDetail(detailInDto5));
                    return featureEntity5;
//                    querySelectedLayerOutdto.setWbhLayer(featureEntity5);
                case "67a9c7f5-5893-4571-b184-de04b7b7b722":
                    // key 低保边缘 -
                    DetailInDto detailInDto6 = new DetailInDto("DBBYPOPUTION_DETAIL");
                    keyPopulationService.queryDetail(detailInDto6);
                    FeatureEntity featureEntity6 = transPoint(keyPopulationService.queryDetail(detailInDto6));
                    return featureEntity6;
//                    querySelectedLayerOutdto.setDbbyLayer(featureEntity6);
                case "7cb9d37e-c025-4e73-9c9a-c4396018bc79" :
                    //社区
                    List cfShequList =  cfShequMapper.queryList(null,null,null,null);
                    FeatureEntity featureEntity7  =    transPolyGen(cfShequList);
                    return featureEntity7;
//                    querySelectedLayerOutdto.setSqLayer(featureEntity7);
                case "28278353-7920-410e-9d69-191a0971d97f" :
                    //小区
                    List  cfXiaoquResponseList = cfXiaoquMapper.queryList(querySelectedLayerIndto.getId(), null, null,null,null);
                    FeatureEntity featureEntity8  =   transPolyGen(cfXiaoquResponseList);
                    return featureEntity8;
                case "0e5c4c5d-047b-44cd-8ec7-3bf4cef06248" :
                    // 楼栋
                    if (querySelectedLayerIndto.getId() !=null ){
                        CfXiaoqu cfXiaoqu1 = cfXiaoquMapper.selectByPrimaryKey(querySelectedLayerIndto.getId());
                        querySelectedLayerIndto.setId(cfXiaoqu1.getName());
                    }
                    List  cfJianzhuResponseList = cfJianzhuMapper.queryList(querySelectedLayerIndto.getId(), null, null,null,null);
                    FeatureEntity featureEntity9  =   transPolyGen(cfJianzhuResponseList);
                    return featureEntity9;
                // 还欠缺部分数据
                case "c296aaa7-bd8c-4c86-aa2f-f49058fec016" :
                    // 死亡人口
                    List swrkList     = swrkPopulationMapper.queryList(null,null,null,null);
                    FeatureEntity featureEntity10  =   transPolyGen(swrkList);
                    return featureEntity10;
                default:
                    return null;

            }
    }


    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public RPage2 querySingleLayerList(QuerySingleLayerIndto inDto) {
        switch (inDto.getLayer()) {
            case "7cb9d37e-c025-4e73-9c9a-c4396018bc79":
                //社区
                //根据条件查询对应的数据
                Integer count   =  cfShequMapper.queryListCount(inDto.getKeyword(), inDto.getPolygonString(),inDto.getPage(),inDto.getSize());
                List cfShequResponses = cfShequMapper.queryList(inDto.getKeyword(), inDto.getPolygonString(),inDto.getPage(),inDto.getSize());
                FeatureEntity featureEntity  =  transPolyGen(cfShequResponses);
                return new RPage2(count,featureEntity,count % inDto.getSize() == 0 ? count / inDto.getSize() : count / inDto.getSize() + 1) ;
            case "28278353-7920-410e-9d69-191a0971d97f" :
                //小区
                // 这里的逻辑id 是父图层的id 下钻逻辑
                Integer count1   =  cfXiaoquMapper.queryListCount(inDto.getId(),inDto.getKeyword(), inDto.getPolygonString(),inDto.getPage(),inDto.getSize());
                List cfShequResponses1 = cfXiaoquMapper.queryList(inDto.getId(),inDto.getKeyword(), inDto.getPolygonString(),inDto.getPage(),inDto.getSize());
                FeatureEntity featureEntity1  =  transPolyGen(cfShequResponses1);
                return new RPage2(count1,featureEntity1,count1 % inDto.getSize() == 0 ? count1 / inDto.getSize() : count1 / inDto.getSize() + 1) ;
            case "0e5c4c5d-047b-44cd-8ec7-3bf4cef06248" :
                //楼栋
                // 这里是同belong 进行关联
                if (inDto.getId() !=null ){
                      CfXiaoqu cfXiaoqu1 = cfXiaoquMapper.selectByPrimaryKey(inDto.getId());
                      inDto.setId(cfXiaoqu1.getName());
                 }
                Integer count2 =  cfJianzhuMapper.queryListCount(inDto.getId(), inDto.getKeyword(), inDto.getPolygonString(), inDto.getPage(), inDto.getSize());
                // 这里有中心点的逻辑
                List cfShequResponses2 = cfJianzhuMapper.queryList(inDto.getId(),inDto.getKeyword(), inDto.getPolygonString(),inDto.getPage(),inDto.getSize());
                FeatureEntity featureEntity2 =  transPolyGen(cfShequResponses2);
                return new RPage2(count2,featureEntity2,count2 % inDto.getSize() == 0 ? count2 / inDto.getSize() : count2 / inDto.getSize() + 1) ;
            case "815d184e-765d-494f-88ac-c3ed8dad9eed":
                // 这里是人口管理 查询的三种数据的总和
                Integer count3 =   viewTpBasicPopulationMapper.queryAllListCount(inDto.getId(), inDto.getKeyword(), inDto.getPolygonString(), inDto.getPage(), inDto.getSize());
                List ViewTpBasicPopulationResponse = viewTpBasicPopulationMapper.queryAllList(inDto.getId(), inDto.getKeyword(), inDto.getPolygonString(), inDto.getPage(), inDto.getSize());
                FeatureEntity featureEntity3 = transPoint(ViewTpBasicPopulationResponse);
                return new RPage2(count3,featureEntity3, count3 % inDto.getSize() == 0 ? count3 / inDto.getSize() : count3 / inDto.getSize() + 1) ;
             case "b7245825-34e8-4a55-a9cb-14382d99d8f9":
                // 老年人
                Integer count4 =   viewElderlyPopulationMapper.queryListCount(inDto.getId(), inDto.getKeyword(), inDto.getPolygonString(), inDto.getPage(), inDto.getSize());
                List ViewTpBasicPopulationResponse1 = viewElderlyPopulationMapper.queryList(inDto.getId(), inDto.getKeyword(), inDto.getPolygonString(), inDto.getPage(), inDto.getSize());
                FeatureEntity featureEntity4 = transPoint(ViewTpBasicPopulationResponse1);
                return new RPage2(count4,featureEntity4, count4 % inDto.getSize() == 0 ? count4 / inDto.getSize() : count4 / inDto.getSize() + 1) ;
            case "d9f5a85e-da95-4ba2-ad38-532fa5815ed6":
                // 残疾人口
                Integer count5 =     viewDisabledPopulationMapper.queryListCount(inDto);
                List viewDisablePopulationResponse1 =  viewDisabledPopulationMapper.queryList(inDto);
                FeatureEntity featureEntity5 = transPoint(viewDisablePopulationResponse1);
                return new RPage2(count5,featureEntity5, count5 % inDto.getSize() == 0 ? count5 / inDto.getSize() : count5 / inDto.getSize() + 1) ;
            case "23026fae-4670-4864-af9c-e1951120bd17" :
                //低保户
                Integer count6 =     viewDbhPopulationMapper.queryListCount(inDto);
                List viewDbhPopulationResponse =  viewDbhPopulationMapper.queryList(inDto);
                FeatureEntity featureEntity6 = transPoint(viewDbhPopulationResponse);
                return new RPage2(count6,featureEntity6, count6 % inDto.getSize() == 0 ? count6 / inDto.getSize() : count6 / inDto.getSize() + 1) ;

            case "1ddf3722-56db-4733-b57f-68c2443e61cf" :
                // 五保户
                Integer count7 =  viewWbhPopulationMapper.queryListCount(inDto);
                List viewWbhPopulationResponse =  viewWbhPopulationMapper.queryList(inDto);
                FeatureEntity featureEntity7 = transPoint(viewWbhPopulationResponse);
                return new RPage2(count7,featureEntity7, count7 % inDto.getSize() == 0 ? count7 / inDto.getSize() : count7 / inDto.getSize() + 1) ;
            case "67a9c7f5-5893-4571-b184-de04b7b7b722" :
                // 低保边缘
                Integer count8 =  viewDbbyPopulationMapper.queryListCount(inDto);
                List viewDbbyPopulationResponse =  viewDbbyPopulationMapper.queryList(inDto);
                FeatureEntity featureEntity8 = transPoint(viewDbbyPopulationResponse);
                return new RPage2(count8,featureEntity8, count8 % inDto.getSize() == 0 ? count8 / inDto.getSize() : count8 / inDto.getSize() + 1) ;
            case "c296aaa7-bd8c-4c86-aa2f-f49058fec016" :
                //死亡人口
                Integer count9 =  swrkPopulationMapper.queryListCount(inDto);
                List viewSwrkPopulationResponse =  swrkPopulationMapper.queryList(inDto.getKeyword(),inDto.getPolygonString(),inDto.getPage(),inDto.getSize());
                FeatureEntity featureEntity9 = transPoint(viewSwrkPopulationResponse);
                return new RPage2(count9,featureEntity9, count9 % inDto.getSize() == 0 ? count9 / inDto.getSize() : count9 / inDto.getSize() + 1) ;
            default:
                return null;

        }
    }


    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public RPage queryBuildingList(QueryMapLayerIndto indto) {
        switch (indto.getType()) {
            case "zrk":
                //总人口
                Integer count =    viewTpBasicPopulationMapper.queryZrkBuildingCount(indto);
                List<ViewTpBasicPopulation> viewTpBasicPopulations  =  viewTpBasicPopulationMapper.queryZrkBuildingList(indto);
                return new RPage(count,viewTpBasicPopulations,count % indto.getSize() == 0 ? count / indto.getSize() : count / indto.getSize() + 1) ;
            case "zdrk" :
                Integer count1 =    viewTpBasicPopulationMapper.queryZdrkBuildingCount(indto);
                List<ViewTpBasicPopulation> viewTpBasicPopulations1  =  viewTpBasicPopulationMapper.queryZdrkBuildingList(indto);
                return new RPage(count1,viewTpBasicPopulations1,count1 % indto.getPage() == 0 ? count1 / indto.getSize() : count1 / indto.getSize() + 1) ;
            case "swrk" :
                Integer count2 =    swrkPopulationMapper.querySwrkBuildingCount(indto);
                //这里的sql 不把 身份证号 和 年龄加上
                List<ViewTpBasicPopulation> viewTpBasicPopulations2  =  swrkPopulationMapper.queryZdrkBuildingList(indto);
                return new RPage(count2,viewTpBasicPopulations2,count2 % indto.getPage() == 0 ? count2 / indto.getSize() : count2 / indto.getSize() + 1) ;
            default:
                return null;
        }
    }

    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public List<TpBasicPopulationWithTypeOutDto> queryPersonListByhh(QueryPersonListByhhIndto queryPersonListByhhIndto) {
        //根据户号查询人员信息
        return  viewTpBasicPopulationMapper.selectFamilyInfoList(queryPersonListByhhIndto);
    }


    @Override
     @Cacheable(keyGenerator = "myKeyGenerator")
    public List<Map<String,Object>> queryBuildingSum(QueryMapLayerIndto queryMapLayerIndto) {
        List<Map<String,Object>> objects = new ArrayList<>();
        Map<String, Object> ldrk = new HashMap<>();
        Map<String, Object> zdrk = new HashMap<>();
        Map<String, Object> swrk = new HashMap<>();
        objects.add(ldrk);
        objects.add(zdrk);
        objects.add(swrk);
        Integer ldrkSum =   viewTpBasicPopulationMapper.queryZrkBuildingCount(queryMapLayerIndto);
        ldrk.put("name", "总人口");
        ldrk.put("total", ldrkSum);
        ldrk.put("type", "zrk");
        Integer zdrkSum = viewTpBasicPopulationMapper.queryZdrkBuildingCount(queryMapLayerIndto);
        zdrk.put("name", "重点人口");
        zdrk.put("total", zdrkSum);
        zdrk.put("type", "zdrk");
        Integer swrkSum = swrkPopulationMapper.querySwrkBuildingCount(queryMapLayerIndto);
        swrk.put("name", "死亡人口");
        swrk.put("total", swrkSum);
        swrk.put("type", "swrk");
        return objects ;
    }


    private FeatureEntity transPolyGen(List<BaseJsonResponse> cfShequList) {
        FeatureEntity featureEntity = new FeatureEntity();
        featureEntity.setType("FeatureCollection");
        List<Features> featuresList = new ArrayList<>();
        featureEntity.setFeatures(featuresList);
        for (BaseJsonResponse o : cfShequList) {
            Features features = new Features();
            features.setType("Feature");
//            coordinate 设置 key value
            Geometry geometry = JSON.parseObject(o.getGeojson(), Geometry.class);
            features.setGeometry(geometry);
            features.setProperties(o);
            featuresList.add(features);
        }
        return featureEntity;
    }

    private FeatureEntity transPoint(List list) {
        FeatureEntity featureEntity = new FeatureEntity();
        featureEntity.setType("FeatureCollection");
        List<Features> featuresList = new ArrayList<>();
        featureEntity.setFeatures(featuresList);
        for (Object o : list) {
            Features features = new Features();
            features.setType("Feature");
            Geometry geometry = new Geometry();
            geometry.setType("Point");
            List<Object> coordinate = new ArrayList<>();
//            coordinate 设置 key value
            Method getLon = ReflectionUtils.findMethod(o.getClass(), "getLon");
            Method getLat = ReflectionUtils.findMethod(o.getClass(), "getLat");
            Object lon = ReflectionUtils.invokeMethod(getLon, o);
            Object lat = ReflectionUtils.invokeMethod(getLat, o);
            coordinate.add(lon);
            coordinate.add(lat);
            geometry.setCoordinates(coordinate);
            features.setGeometry(geometry);
            features.setProperties(o);
            featuresList.add(features);
        }
        return featureEntity;
    }
}



