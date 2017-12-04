package cn.com.ibm.hackthon.po;

import java.util.Date;

public class Picture {
    private Integer id;

    private String picPath;

    private Date createTime;

    private Date changeTime;

    private Integer picutureType;

    private Integer itemId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public Integer getPicutureType() {
        return picutureType;
    }

    public void setPicutureType(Integer picutureType) {
        this.picutureType = picutureType;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
}