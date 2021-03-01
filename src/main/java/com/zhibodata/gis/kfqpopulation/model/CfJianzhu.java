package com.zhibodata.gis.kfqpopulation.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "cf_jianzhu")
public class CfJianzhu {
    @Id
    private Integer id;

    private Object geom;

    private Long objectid;

    private String name;

    private String shortname;

    private String address;

    private String classid;

    private String type;

    private String state;

    private String obligee;

    private String zipcode;

    private Long upfloor;

    private String downfloor;

    private String jzmj;

    private BigDecimal zdmj;

    private BigDecimal height;

    private String used;

    private String number;

    private String structure;

    private String belong;

    private String region;

    private String fuid;

    private String datasource;

    private String creator;

    private String createdate;

    private String editor;

    private String updatedate;

    private String csly;

    private String lzhly;

    private String jznl;

    private String remark;

    private Long jznl1;

    private String belongid;

    private String sscsq;

    private String ssjdz;

    private String labelname;

    @Column(name = "gdb_geomat")
    private String gdbGeomat;

    private String isprotecte;

    private String tscl;

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
     * @return obligee
     */
    public String getObligee() {
        return obligee;
    }

    /**
     * @param obligee
     */
    public void setObligee(String obligee) {
        this.obligee = obligee;
    }

    /**
     * @return zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * @return upfloor
     */
    public Long getUpfloor() {
        return upfloor;
    }

    /**
     * @param upfloor
     */
    public void setUpfloor(Long upfloor) {
        this.upfloor = upfloor;
    }

    /**
     * @return downfloor
     */
    public String getDownfloor() {
        return downfloor;
    }

    /**
     * @param downfloor
     */
    public void setDownfloor(String downfloor) {
        this.downfloor = downfloor;
    }

    /**
     * @return jzmj
     */
    public String getJzmj() {
        return jzmj;
    }

    /**
     * @param jzmj
     */
    public void setJzmj(String jzmj) {
        this.jzmj = jzmj;
    }

    /**
     * @return zdmj
     */
    public BigDecimal getZdmj() {
        return zdmj;
    }

    /**
     * @param zdmj
     */
    public void setZdmj(BigDecimal zdmj) {
        this.zdmj = zdmj;
    }

    /**
     * @return height
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * @param height
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * @return used
     */
    public String getUsed() {
        return used;
    }

    /**
     * @param used
     */
    public void setUsed(String used) {
        this.used = used;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return structure
     */
    public String getStructure() {
        return structure;
    }

    /**
     * @param structure
     */
    public void setStructure(String structure) {
        this.structure = structure;
    }

    /**
     * @return belong
     */
    public String getBelong() {
        return belong;
    }

    /**
     * @param belong
     */
    public void setBelong(String belong) {
        this.belong = belong;
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
     * @return csly
     */
    public String getCsly() {
        return csly;
    }

    /**
     * @param csly
     */
    public void setCsly(String csly) {
        this.csly = csly;
    }

    /**
     * @return lzhly
     */
    public String getLzhly() {
        return lzhly;
    }

    /**
     * @param lzhly
     */
    public void setLzhly(String lzhly) {
        this.lzhly = lzhly;
    }

    /**
     * @return jznl
     */
    public String getJznl() {
        return jznl;
    }

    /**
     * @param jznl
     */
    public void setJznl(String jznl) {
        this.jznl = jznl;
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
     * @return jznl1
     */
    public Long getJznl1() {
        return jznl1;
    }

    /**
     * @param jznl1
     */
    public void setJznl1(Long jznl1) {
        this.jznl1 = jznl1;
    }

    /**
     * @return belongid
     */
    public String getBelongid() {
        return belongid;
    }

    /**
     * @param belongid
     */
    public void setBelongid(String belongid) {
        this.belongid = belongid;
    }

    /**
     * @return sscsq
     */
    public String getSscsq() {
        return sscsq;
    }

    /**
     * @param sscsq
     */
    public void setSscsq(String sscsq) {
        this.sscsq = sscsq;
    }

    /**
     * @return ssjdz
     */
    public String getSsjdz() {
        return ssjdz;
    }

    /**
     * @param ssjdz
     */
    public void setSsjdz(String ssjdz) {
        this.ssjdz = ssjdz;
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
     * @return gdb_geomat
     */
    public String getGdbGeomat() {
        return gdbGeomat;
    }

    /**
     * @param gdbGeomat
     */
    public void setGdbGeomat(String gdbGeomat) {
        this.gdbGeomat = gdbGeomat;
    }

    /**
     * @return isprotecte
     */
    public String getIsprotecte() {
        return isprotecte;
    }

    /**
     * @param isprotecte
     */
    public void setIsprotecte(String isprotecte) {
        this.isprotecte = isprotecte;
    }

    /**
     * @return tscl
     */
    public String getTscl() {
        return tscl;
    }

    /**
     * @param tscl
     */
    public void setTscl(String tscl) {
        this.tscl = tscl;
    }
}