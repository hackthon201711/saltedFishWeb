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


	//根据用户查找自己的商品

	/**
	 *
	 * @param userid
	 * @param status 状态  0 为已经发布  1为已经关闭
	 * @return
	 * @throws SQLException
	 */
	List<ItemDTO> selectItemListByUser(int userid,int status)throws SQLException;
}
