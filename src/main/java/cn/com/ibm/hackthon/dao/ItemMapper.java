package cn.com.ibm.hackthon.dao;

import java.util.List;

import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.po.Item;
import cn.com.ibm.hackthon.po.ItemExample;

public interface ItemMapper {

    //创建商品
    int insertItem(Item record);

    //根据商品id删除商品
    void deleteItemById(int itemid);
    List<ItemDTO> selectItemList(ItemExample example);
    
    List<ItemDTO> selectHotItemList();

    List<ItemDTO> selectItemWithMainPicByUserId(int userid);
}