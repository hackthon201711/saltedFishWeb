package cn.com.ibm.hackthon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping(value="/page_index",method=RequestMethod.GET)
	public ModelAndView showIndexPage() {
		ModelAndView mav = new ModelAndView(PAGE_INDEX);
		List<ItemDTO> newItemList = helper.getNewArravalItem();
		mav.addObject("newItemList", newItemList);//新到商品list

		List<ItemDTO> hotItemList = helper.getHotItem();
		mav.addObject("hotItemList", hotItemList);//热门商品list
		return mav;
	}
}
