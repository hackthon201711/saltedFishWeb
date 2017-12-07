package cn.com.ibm.hackthon.controller.helper;

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
	 */
	public List<ItemDTO> getNewArravalItem(){
		return itemService.getNewArrivalItemList();
	}
	
	/**
	 * 取得热门物品列表
	 * @return
	 */
	public List<ItemDTO> getHotItem(){
		return itemService.getHotItemList();
	}
}
