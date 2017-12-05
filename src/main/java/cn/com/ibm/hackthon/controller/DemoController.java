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
}
