package cn.com.ibm.hackthon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.ibm.hackthon.controller.helper.ShopControllerHelper;
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
	public String showIndexPage() {
		
		return PAGE_INDEX;
	}
}
