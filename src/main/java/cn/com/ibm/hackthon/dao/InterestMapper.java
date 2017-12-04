package cn.com.ibm.hackthon.dao;

import cn.com.ibm.hackthon.po.Interest;

public interface InterestMapper {
    int insert(Interest record);

    int insertSelective(Interest record);
}