
package cn.com.ibm.hackthon.controller;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

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
import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.po.User;
import cn.com.ibm.hackthon.service.ItemService;



@Controller
@RequestMapping("/myitem")
public class myitemController {
	private static final Log logger = LogFactory.getLog(myitemController.class);
	
	@Resource
	ItemService itemService;
	
	@RequestMapping(value="/myitem",method=RequestMethod.GET)
	public String myitem(Model model,HttpSession httpSession) throws SQLException {


		String userID = (String) httpSession.getAttribute("userID");
		System.out.println("login userID="+ userID);

		List<ItemDTO> items = itemService.selectItemListByUser(userID, 0,0);
		System.out.println("ls size="+items.size());
		System.out.println("ls1="+ items.get(0).getItemName());
		model.addAttribute("myitems", items);
		
		return "shop-myitem";
	}
	
	@RequestMapping(value="/FWmyitem",method=RequestMethod.GET)
	public String FWmyitem(Model model) {

		model.addAttribute("loginmsg", "guest");
		return "login";
	}
	
	
}

