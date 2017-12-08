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
	 * @param username
	 * @param status 状态  0 为已经发布  1为已经关闭
	 * @param pic_typ 0 为获取主图 1 为获取全部
	 * @return
	 * @throws SQLException
	 */
	List<ItemDTO> selectItemListByUser( String username,int status,int pic_typ)throws SQLException;


	/**
	 * 查找商品详细信息
	 */
	List<Item> selectItemByUserName(String username,int itemid)throws SQLException;
}
