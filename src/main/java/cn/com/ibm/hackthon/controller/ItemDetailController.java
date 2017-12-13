package cn.com.ibm.hackthon.controller;


import cn.com.ibm.hackthon.controller.helper.BehaviorControllerHelper;
import cn.com.ibm.hackthon.controller.helper.ItemDetailControllerHelper;
import cn.com.ibm.hackthon.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;

/**
 * 展示物品详情
 */
@Controller
@RequestMapping("/itemD")
public class ItemDetailController {


    @Autowired
    private ItemDetailControllerHelper itemDetailHelper;
    @Autowired
    private BehaviorControllerHelper behaviorHelper;

    /**
     * 显示物品详情
     */
    @RequestMapping(value="/ItemDetail",method= RequestMethod.GET)
    public ModelAndView publicItem(int itemid,Model model,HttpSession httpSession) throws SQLException {
    	System.out.println("itemid===>"+ itemid);
    	String userid = (String) httpSession.getAttribute("userID");
    	System.out.println("userid===>"+ userid);
    	if(userid!=null) {
    	   	behaviorHelper.addOrupdateBehavior(userid,itemid);
    	}
 
        //display drop down list info
        ModelAndView mav= itemDetailHelper.displayItemDetail("shop-item",itemid);
        return mav;
    }

}
