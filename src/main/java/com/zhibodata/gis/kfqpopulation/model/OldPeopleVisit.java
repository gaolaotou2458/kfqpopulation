package com.zhibodata.gis.kfqpopulation.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "old_people_visit")
public class OldPeopleVisit {
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

    @Column(name = "vist_time")
    private Date vistTime;

    private String vister;

    @Column(name = "vist_content")
    private String vistContent;

    @Column(name = "personal_card")
    private Long personalCard;

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
     * @return vist_time
     */
    public Date getVistTime() {
        return vistTime;
    }

    /**
     * @param vistTime
     */
    public void setVistTime(Date vistTime) {
        this.vistTime = vistTime;
    }

    /**
     * @return vister
     */
    public String getVister() {
        return vister;
    }

    /**
     * @param vister
     */
    public void setVister(String vister) {
        this.vister = vister;
    }

    /**
     * @return vist_content
     */
    public String getVistContent() {
        return vistContent;
    }

    /**
     * @param vistContent
     */
    public void setVistContent(String vistContent) {
        this.vistContent = vistContent;
    }

    /**
     * @return personal_card
     */
    public Long getPersonalCard() {
        return personalCard;
    }

    /**
     * @param personalCard
     */
    public void setPersonalCard(Long personalCard) {
        this.personalCard = personalCard;
    }
}