
package cn.com.ibm.hackthon.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.ibm.hackthon.controller.helper.DemoControllerHelper;
import cn.com.ibm.hackthon.controller.helper.RegisterControllerHelper;
import cn.com.ibm.hackthon.controller.helper.loginControllerHelper;
import cn.com.ibm.hackthon.dao.UserMapper;
import cn.com.ibm.hackthon.po.User;



@Controller
@RequestMapping
public class logoffController {
	private static final Log logger = LogFactory.getLog(logoffController.class);
	
	@RequestMapping(value="/logoff",method=RequestMethod.GET)
	public String logoff(Model model,HttpSession httpSession) {

		httpSession.removeAttribute("userID");

		System.out.println("logoff success=");
		
		return "redirect:/page_index";
	}
	
}

