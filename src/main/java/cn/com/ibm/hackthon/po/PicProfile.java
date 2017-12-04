package cn.com.ibm.hackthon.po;

public class PicProfile {
    private Integer id;

    private String picPath;

    private Integer picutureType;

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

    public Integer getPicutureType() {
        return picutureType;
    }

    public void setPicutureType(Integer picutureType) {
        this.picutureType = picutureType;
    }
}