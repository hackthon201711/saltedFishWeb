
package cn.com.ibm.hackthon.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.com.ibm.hackthon.controller.helper.DemoControllerHelper;
import cn.com.ibm.hackthon.controller.helper.RegisterControllerHelper;
import cn.com.ibm.hackthon.dao.UserMapper;
import cn.com.ibm.hackthon.po.User;



@Controller
@RequestMapping
public class RegisterController {
	private static final Log logger = LogFactory.getLog(RegisterController.class);
	
	@Resource
	RegisterControllerHelper regHelper;
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(String userID,String psw1,String psw2,String nickName,String email,String telephone, Model model) {
		System.out.println("register start=" + userID + ","+psw1);
		int RCcode = regHelper.constructUser(userID,psw1,psw2,nickName,email,telephone);
		System.out.println("RCcode=" + RCcode);
		model.addAttribute("loginmsg", "ע��ɹ������¼��");
		return "login";
	}
	
	@RequestMapping(value="/FWregister",method=RequestMethod.GET)
	public String FWregister(Model model) {

		model.addAttribute("msg", "guest");
		return "user-register";
	}
	
	
}

