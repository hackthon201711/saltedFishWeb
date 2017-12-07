package cn.com.ibm.hackthon.dao;

import cn.com.ibm.hackthon.po.Item;

public interface ItemMapper {

    //创建商品
    int insertItem(Item record);

    //根据商品id删除商品
    void deleteItemById(int itemid);
}