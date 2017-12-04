package cn.com.ibm.hackthon.dao;

import cn.com.ibm.hackthon.po.Location;

public interface LocationMapper {
    int insert(Location record);

    int insertSelective(Location record);
}