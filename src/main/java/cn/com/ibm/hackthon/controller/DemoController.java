
package cn.com.ibm.hackthon.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.ibm.hackthon.controller.helper.DemoControllerHelper;


/**
 * demo controller
 * @author lizhiwei
 *
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
	private static final Log logger = LogFactory.getLog(DemoController.class);
	
	@Resource
	DemoControllerHelper demoHelper;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHello(Model model,HttpServletRequest request) {
		logger.info(request.getServletContext().getRealPath("test"));
		logger.info(demoHelper.sayHello());
		model.addAttribute("msg", "guest");
		return "demo";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(Model model) {
		logger.info(demoHelper.sayHello());
		model.addAttribute("msg", "guest");
		return "login";
	}
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(Model model) {
		logger.info(demoHelper.sayHello());
		model.addAttribute("msg", "guest");
		return "index";
	}
	
	@RequestMapping(value="/shopItem",method=RequestMethod.GET)
	public String shopItem(Model model) {
		logger.info(demoHelper.sayHello());
		model.addAttribute("msg", "guest");
		return "shop-item";
	}
	
	@RequestMapping(value="/prodList",method=RequestMethod.GET)
	public String prodList(Model model) {
		logger.info(demoHelper.sayHello());
		model.addAttribute("msg", "guest");
		return "shop-product-list";
	}
	
	@RequestMapping(value="/searchResult",method=RequestMethod.GET)
	public String SearchResult(Model model) {
		logger.info(demoHelper.sayHello());
		model.addAttribute("msg", "guest");
		return "shop-search-result";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String register(Model model) {
		logger.info(demoHelper.sayHello());
		model.addAttribute("msg", "guest");
		return "user-register";
	}
	
	@RequestMapping(value="/wishList",method=RequestMethod.GET)
	public String wishList(Model model) {
		logger.info(demoHelper.sayHello());
		model.addAttribute("msg", "guest");
		return "shop-wishlist";
	}
	
	@RequestMapping(value="/publicItem",method=RequestMethod.GET)
	public String publicItem(Model model) {
		logger.info(demoHelper.sayHello());
		model.addAttribute("msg", "guest");
		return "public-item";
	}
}

