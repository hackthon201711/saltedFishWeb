package cn.com.ibm.hackthon.dao;

import cn.com.ibm.hackthon.po.PicProfile;

public interface PicProfileMapper {
    int insert(PicProfile record);

    int insertSelective(PicProfile record);
}