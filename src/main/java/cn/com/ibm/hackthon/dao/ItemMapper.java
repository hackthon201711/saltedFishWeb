package cn.com.ibm.hackthon.dao;

import cn.com.ibm.hackthon.po.Item;

public interface ItemMapper {
    int insert(Item record);

    int insertItem(Item record);

    void deleteItemById(int itemid);
}