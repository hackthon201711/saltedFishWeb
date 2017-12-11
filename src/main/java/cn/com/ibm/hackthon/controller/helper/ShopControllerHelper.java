package cn.com.ibm.hackthon.controller.helper;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.service.ItemService;
import cn.com.ibm.hackthon.util.Constant;

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
		List<ItemDTO> list = itemService.getNewArrivalItemList();
		changePicPath(list);
		return list;
	}
	
	/**
	 * 取得热门物品列表
	 * @return
	 * @throws SQLException 
	 */
	public List<ItemDTO> getHotItem() throws SQLException{
		List<ItemDTO> list = itemService.getHotItemList();
		changePicPath(list);
		return list;
	}
	

	/**
	 * 取得推荐物品列表
	 * @return
	 * @throws SQLException 
	 */
	public List<ItemDTO> getRecommendItem(String userId) throws SQLException{
		List<ItemDTO> list = itemService.getRecommendItemList(userId);
		changePicPath(list);
		return list;
	}
	
	private void changePicPath(List<ItemDTO> list) {
		list.stream().forEach(dto->dto.setPicPath(Constant.PICTURE_VIRTUAL_ADRESS+dto.getPicPath()));
	}
}
