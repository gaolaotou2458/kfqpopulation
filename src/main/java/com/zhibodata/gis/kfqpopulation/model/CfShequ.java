package com.zhibodata.gis.kfqpopulation.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cf_shequ")
public class CfShequ {
    @Id
    private Integer id;

    private Object geom;

    private Long objectid;

    private String classid;

    private String type;

    private String fuid;

    private String datasource;

    private String creator;

    private Date createdate;

    private String editor;

    private Date updatedate;

    private String remark;

    private String name;

    private String pyname;

    private String alias;

    private String shortname;

    private Double mj;

    private String region;

    private String usedname;

    private Double population;

    @Column(name = "shape_star")
    private Double shapeStar;

    @Column(name = "shape_stle")
    private Double shapeStle;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return geom
     */
    public Object getGeom() {
        return geom;
    }

    /**
     * @param geom
     */
    public void setGeom(Object geom) {
        this.geom = geom;
    }

    /**
     * @return objectid
     */
    public Long getObjectid() {
        return objectid;
    }

    /**
     * @param objectid
     */
    public void setObjectid(Long objectid) {
        this.objectid = objectid;
    }

    /**
     * @return classid
     */
    public String getClassid() {
        return classid;
    }

    /**
     * @param classid
     */
    public void setClassid(String classid) {
        this.classid = classid;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return fuid
     */
    public String getFuid() {
        return fuid;
    }

    /**
     * @param fuid
     */
    public void setFuid(String fuid) {
        this.fuid = fuid;
    }

    /**
     * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
     * @param datasource
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * @return editor
     */
    public String getEditor() {
        return editor;
    }

    /**
     * @param editor
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * @return updatedate
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * @param updatedate
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return pyname
     */
    public String getPyname() {
        return pyname;
    }

    /**
     * @param pyname
     */
    public void setPyname(String pyname) {
        this.pyname = pyname;
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return shortname
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * @param shortname
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    /**
     * @return mj
     */
    public Double getMj() {
        return mj;
    }

    /**
     * @param mj
     */
    public void setMj(Double mj) {
        this.mj = mj;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return usedname
     */
    public String getUsedname() {
        return usedname;
    }

    /**
     * @param usedname
     */
    public void setUsedname(String usedname) {
        this.usedname = usedname;
    }

    /**
     * @return population
     */
    public Double getPopulation() {
        return population;
    }

    /**
     * @param population
     */
    public void setPopulation(Double population) {
        this.population = population;
    }

    /**
     * @return shape_star
     */
    public Double getShapeStar() {
        return shapeStar;
    }

    /**
     * @param shapeStar
     */
    public void setShapeStar(Double shapeStar) {
        this.shapeStar = shapeStar;
    }

    /**
     * @return shape_stle
     */
    public Double getShapeStle() {
        return shapeStle;
    }

    /**
     * @param shapeStle
     */
    public void setShapeStle(Double shapeStle) {
        this.shapeStle = shapeStle;
    }
}