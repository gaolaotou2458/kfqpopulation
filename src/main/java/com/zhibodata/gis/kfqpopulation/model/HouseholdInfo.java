package com.zhibodata.gis.kfqpopulation.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "household_info")
public class HouseholdInfo {
    @Id
    private String id;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_data")
    private Date updateData;

    @Column(name = "delete_status")
    private String deleteStatus;

    private String hlx;

    private String hkxz;

    private String ssxq;

    private String jlx;

    private String mlph;

    private String mlxz;

    private Date cxsj;

    private String hh;

    private String hzsfzhm;

    private Date jlsj;

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
     * @return create_by
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * @return created_date
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return update_by
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * @return update_data
     */
    public Date getUpdateData() {
        return updateData;
    }

    /**
     * @param updateData
     */
    public void setUpdateData(Date updateData) {
        this.updateData = updateData;
    }

    /**
     * @return delete_status
     */
    public String getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * @param deleteStatus
     */
    public void setDeleteStatus(String deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * @return hlx
     */
    public String getHlx() {
        return hlx;
    }

    /**
     * @param hlx
     */
    public void setHlx(String hlx) {
        this.hlx = hlx;
    }

    /**
     * @return hkxz
     */
    public String getHkxz() {
        return hkxz;
    }

    /**
     * @param hkxz
     */
    public void setHkxz(String hkxz) {
        this.hkxz = hkxz;
    }

    /**
     * @return ssxq
     */
    public String getSsxq() {
        return ssxq;
    }

    /**
     * @param ssxq
     */
    public void setSsxq(String ssxq) {
        this.ssxq = ssxq;
    }

    /**
     * @return jlx
     */
    public String getJlx() {
        return jlx;
    }

    /**
     * @param jlx
     */
    public void setJlx(String jlx) {
        this.jlx = jlx;
    }

    /**
     * @return mlph
     */
    public String getMlph() {
        return mlph;
    }

    /**
     * @param mlph
     */
    public void setMlph(String mlph) {
        this.mlph = mlph;
    }

    /**
     * @return mlxz
     */
    public String getMlxz() {
        return mlxz;
    }

    /**
     * @param mlxz
     */
    public void setMlxz(String mlxz) {
        this.mlxz = mlxz;
    }

    /**
     * @return cxsj
     */
    public Date getCxsj() {
        return cxsj;
    }

    /**
     * @param cxsj
     */
    public void setCxsj(Date cxsj) {
        this.cxsj = cxsj;
    }

    /**
     * @return hh
     */
    public String getHh() {
        return hh;
    }

    /**
     * @param hh
     */
    public void setHh(String hh) {
        this.hh = hh;
    }

    /**
     * @return hzsfzhm
     */
    public String getHzsfzhm() {
        return hzsfzhm;
    }

    /**
     * @param hzsfzhm
     */
    public void setHzsfzhm(String hzsfzhm) {
        this.hzsfzhm = hzsfzhm;
    }

    /**
     * @return jlsj
     */
    public Date getJlsj() {
        return jlsj;
    }

    /**
     * @param jlsj
     */
    public void setJlsj(Date jlsj) {
        this.jlsj = jlsj;
    }
}