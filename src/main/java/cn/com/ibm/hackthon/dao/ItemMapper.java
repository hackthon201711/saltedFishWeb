package cn.com.ibm.hackthon.dao;

import java.util.List;

import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.po.Item;
import cn.com.ibm.hackthon.po.ItemExample;
import org.apache.ibatis.annotations.Param;

public interface ItemMapper {

    //创建商品
    int insertItem(Item record);

    //根据商品id删除商品
    void deleteItemById(int itemid);
    
    /** 获得新到商品列表*/
    List<ItemDTO> selectItemList(ItemExample example);
    
    /** 获得热门商品列表*/
    List<ItemDTO> selectHotItemList();

    /**
     * 获得感兴趣商品列表
     * @return
     */
    List<ItemDTO> selectInterestedItemByUserId(String UserId);
    /**
     * 根据商品id集合获得推荐商品列表
     * @param userName
     * @return
     */
    List<ItemDTO> selectItemByItemIds(List<String> itemIds);
    
    List<ItemDTO> selectItemWithMainPicByUserId(String username,int status,int pic_typ);

    List<Item> selectItemByUserName(int item_id);
}