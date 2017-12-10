package cn.com.ibm.hackthon.controller.helper;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.service.ItemService;

@Component
public class ShopControllerHelper {
	
	@Resource
	private ItemService itemService;
	
	/**
	 * 取得新到物品列表
	 * @return
	 * @throws SQLException 
	 */
	public List<ItemDTO> getNewArravalItem() throws SQLException{
		return itemService.getNewArrivalItemList();
	}
	
	/**
	 * 取得热门物品列表
	 * @return
	 * @throws SQLException 
	 */
	public List<ItemDTO> getHotItem() throws SQLException{
		return itemService.getHotItemList();
	}
	

	/**
	 * 取得推荐物品列表
	 * @return
	 * @throws SQLException 
	 */
	public List<ItemDTO> getRecommendItem(String userId) throws SQLException{
		return itemService.getRecommendItemList(userId);
	}
}
