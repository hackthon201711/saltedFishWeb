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
     * 根据用户id获得推荐商品列表
     * @param userName
     * @return
     */
    List<ItemDTO> selectRecommendItemByUserId(ItemExample example);
    
    List<ItemDTO> selectItemWithMainPicByUserId(String username,int status,@Param("picFlag") int pic_typ);

    List<Item> selectItemByUserName(String username,int item_id);
}