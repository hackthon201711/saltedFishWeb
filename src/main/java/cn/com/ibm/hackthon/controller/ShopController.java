package cn.com.ibm.hackthon.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	private Logger log = LoggerFactory.getLogger(ShopController.class);
	@Autowired
	private ShopControllerHelper helper;
	
	@RequestMapping(value="/page_index",method=RequestMethod.GET)
	public ModelAndView showIndexPage(HttpSession session) throws SQLException {
		log.info("into the showIndexPage controller....");
		ModelAndView mav = new ModelAndView(PAGE_INDEX);
		List<ItemDTO> newItemList = helper.getNewArravalItem();
		log.info("new item list...."+newItemList);
		mav.addObject("newItemList", newItemList);//新到商品list

		List<ItemDTO> hotItemList = helper.getHotItem();
		log.info("hot Item List...."+hotItemList);
		mav.addObject("hotItemList", hotItemList);//热门商品list
		
		Object obj = session.getAttribute(Constant.USERID_IN_SESSION);
		if(obj!=null) {
			String userId = obj.toString();
			List<ItemDTO> recommendItemList = helper.getRecommendItem(userId);
			log.info("recommend Item List...."+recommendItemList);
			mav.addObject("recommendItemList", recommendItemList);//推荐商品list
		}
		return mav;
	}
}
