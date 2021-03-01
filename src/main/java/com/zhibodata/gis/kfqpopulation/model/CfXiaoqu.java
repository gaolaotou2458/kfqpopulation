package com.zhibodata.gis.kfqpopulation.model;

import javax.persistence.*;

@Table(name = "cf_xiaoqu")
public class CfXiaoqu {
    @Id
    private String id;

    private Object geom;

    private Long objectid;

    private String name;

    private String alias;

    private String pyname;

    private String jc;

    private String classid;

    private String type;

    private String standard;

    private String creditcode;

    private String state;

    private String region;

    private String layer;

    private String fuid;

    private String datasource;

    private String creator;

    private String editor;

    private String remark;

    private Double mj;

    private String createdate;

    private String updatedate;

    private String address;

    private String labelname;

    private String usedname;

    /**
     * 社区表编号
     */
    @Column(name = "sq_id")
    private String sqId;

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
     * @return jc
     */
    public String getJc() {
        return jc;
    }

    /**
     * @param jc
     */
    public void setJc(String jc) {
        this.jc = jc;
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
     * @return standard
     */
    public String getStandard() {
        return standard;
    }

    /**
     * @param standard
     */
    public void setStandard(String standard) {
        this.standard = standard;
    }

    /**
     * @return creditcode
     */
    public String getCreditcode() {
        return creditcode;
    }

    /**
     * @param creditcode
     */
    public void setCreditcode(String creditcode) {
        this.creditcode = creditcode;
    }

    /**
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
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
     * @return layer
     */
    public String getLayer() {
        return layer;
    }

    /**
     * @param layer
     */
    public void setLayer(String layer) {
        this.layer = layer;
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
     * @return createdate
     */
    public String getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    /**
     * @return updatedate
     */
    public String getUpdatedate() {
        return updatedate;
    }

    /**
     * @param updatedate
     */
    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return labelname
     */
    public String getLabelname() {
        return labelname;
    }

    /**
     * @param labelname
     */
    public void setLabelname(String labelname) {
        this.labelname = labelname;
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
     * 获取社区表编号
     *
     * @return sq_id - 社区表编号
     */
    public String getSqId() {
        return sqId;
    }

    /**
     * 设置社区表编号
     *
     * @param sqId 社区表编号
     */
    public void setSqId(String sqId) {
        this.sqId = sqId;
    }
}