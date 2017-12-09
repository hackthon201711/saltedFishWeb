package cn.com.ibm.hackthon.dao;

import cn.com.ibm.hackthon.po.Behavior;

public interface BehaviorMapper {
    int insert(Behavior record);

    int insertSelective(Behavior record);
}