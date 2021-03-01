package com.zhibodata.gis.kfqpopulation.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "search_log")
public class SearchLog {
    @Id
    private String id;

    private String clazz;

    private String method;

    @Column(name = "search_time")
    private Date searchTime;

    @Column(name = "search_ip")
    private String searchIp;

    /**
     * 查询人
     */
    private String searcher;

    private String args;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return clazz
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * @param clazz
     */
    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return method;
    }

    /**
     * @param method
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * @return search_time
     */
    public Date getSearchTime() {
        return searchTime;
    }

    /**
     * @param searchTime
     */
    public void setSearchTime(Date searchTime) {
        this.searchTime = searchTime;
    }

    /**
     * @return search_ip
     */
    public String getSearchIp() {
        return searchIp;
    }

    /**
     * @param searchIp
     */
    public void setSearchIp(String searchIp) {
        this.searchIp = searchIp;
    }

    /**
     * 获取查询人
     *
     * @return searcher - 查询人
     */
    public String getSearcher() {
        return searcher;
    }

    /**
     * 设置查询人
     *
     * @param searcher 查询人
     */
    public void setSearcher(String searcher) {
        this.searcher = searcher;
    }

    /**
     * @return args
     */
    public String getArgs() {
        return args;
    }

    /**
     * @param args
     */
    public void setArgs(String args) {
        this.args = args;
    }
}