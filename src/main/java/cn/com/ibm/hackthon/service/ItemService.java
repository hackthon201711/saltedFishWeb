package cn.com.ibm.hackthon.service;

import java.sql.SQLException;
import java.util.List;

import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.po.Item;

public interface ItemService {
	/**
	 * 取得新上架物品列表
	 * @return
	 */
	List<ItemDTO> getNewArrivalItemList();
	

	/**
	 * 取得热门物品列表
	 * @return
	 */
	List<ItemDTO> getHotItemList();


	/**
	 * 新建商品
	 */
	int  insertItem(Item item)throws SQLException;

	/**
	 * 删除商品
	 */

	void deleteItemById(int id)throws SQLException;
}
