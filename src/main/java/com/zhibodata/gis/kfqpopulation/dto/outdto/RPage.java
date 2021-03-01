package com.zhibodata.gis.kfqpopulation.dto.outdto;

import com.github.pagehelper.PageInfo;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : WangFan
 * create at:  2020/11/13  2:18 PM
 * @ClassName RPage
 * @description:
 * @Version 1.0
 */
@Getter
@Setter
public class RPage<T> implements Serializable{

    private long total = 0;

    private List<T> dataList = new ArrayList<>();

    private int totalPage;

    public RPage(PageInfo<T> pageInfo){

        this.total = pageInfo.getTotal();
        this.dataList = pageInfo.getList();
        this.totalPage = pageInfo.getPages();
    }

    public RPage() {

    }


    public RPage(long total, List<T> dataList, int totalPage) {
        this.total = total;
        this.dataList = dataList;
        this.totalPage = totalPage;
    }
}
