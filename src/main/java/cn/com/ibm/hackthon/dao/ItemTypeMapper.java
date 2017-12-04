package cn.com.ibm.hackthon.dao;

import cn.com.ibm.hackthon.po.itemType;

public interface ItemTypeMapper {
    int insert(itemType record);

    int insertSelective(itemType record);
}