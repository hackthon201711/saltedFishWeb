
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
import cn.com.ibm.hackthon.util.Constant;



@Controller
@RequestMapping
public class loginController {
	private static final Log logger = LogFactory.getLog(loginController.class);
	
	@Resource
	loginControllerHelper loginHelper;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(String userID,String passWord, Model model,HttpSession httpSession) {
		User user = loginHelper.checkAuth(userID,passWord);
		if(user==null) {
			System.out.println("password incorrect!");
			model.addAttribute("errMsg", "Invalidate username or password");
			return "login";
		}
		
		System.out.println("login success!");

		httpSession.setAttribute("userID", user.getLoginname());
		httpSession.setAttribute(Constant.USERID_IN_SESSION, user.getUserid());
		System.out.println("login success="+ httpSession.getAttribute("userID"));
		
		return "redirect:/page_index";
	}
	
	@RequestMapping(value="/FWlogin",method=RequestMethod.GET)
	public String FWlogin(Model model) {
		System.out.println("test!!");
		model.addAttribute("loginmsg", "guest");
		return "login";
	}
	
	
}

