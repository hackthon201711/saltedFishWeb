package cn.com.ibm.hackthon.dao;

import java.util.List;


import cn.com.ibm.hackthon.po.Item;
import cn.com.ibm.hackthon.po.ItemExample;

public interface ItemMapper {
    int insert(Item record);

    int insertItemType(Item record);

    List<Item> selectByExample(ItemExample example);
}