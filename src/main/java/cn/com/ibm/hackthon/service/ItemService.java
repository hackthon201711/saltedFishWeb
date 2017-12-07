package cn.com.ibm.hackthon.service;

import java.util.List;

import cn.com.ibm.hackthon.dto.ItemDTO;

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
}
