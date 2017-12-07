package cn.com.ibm.hackthon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.ibm.hackthon.controller.helper.ShopControllerHelper;
import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.util.Constant;

@RequestMapping
@Controller
/**
 * shop controller类，用于前台shop相关控制
 * @author lizhiwei
 *
 */
public class ShopController implements Constant{
	
	@Autowired
	private ShopControllerHelper helper;
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String showIndexPage(Model model) {
		List<ItemDTO> newItemList = helper.getNewArravalItem();
		model.addAttribute("newItemList", newItemList);//新到商品list

		List<ItemDTO> hotItemList = helper.getHotItem();
		model.addAttribute("hotItemList", hotItemList);//热门商品list
		return PAGE_INDEX;
	}
}
