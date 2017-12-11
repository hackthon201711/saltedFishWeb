package cn.com.ibm.hackthon.po;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Recommend {
    private Integer userid;

    private String itemid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }
    
    @Override
    public String toString() {
    	ReflectionToStringBuilder.toString(this);
    	return super.toString();
    }
}