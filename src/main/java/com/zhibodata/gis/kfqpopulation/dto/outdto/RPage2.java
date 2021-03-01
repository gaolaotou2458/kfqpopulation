package com.zhibodata.gis.kfqpopulation.dto.outdto;

import com.github.pagehelper.PageInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class RPage2<T> {

    private long total = 0;

    private Object  dataList;

    private int totalPage;


    public RPage2(long total, Object dataList, int totalPage) {
        this.total = total;
        this.dataList = dataList;
        this.totalPage = totalPage;
    }
}
