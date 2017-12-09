package cn.com.ibm.hackthon.dao;

import cn.com.ibm.hackthon.po.Recommend;

public interface RecommendMapper {
    int insert(Recommend record);

    int insertSelective(Recommend record);
}