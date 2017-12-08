package cn.com.ibm.hackthon.controller;


import cn.com.ibm.hackthon.controller.helper.ItemDetailControllerHelper;
import cn.com.ibm.hackthon.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;

/**
 * 展示物品详情
 */
@Controller
@RequestMapping("/itemD")
public class ItemDetailController {


    @Autowired
    private ItemDetailControllerHelper itemDetailHelper;

    /**
     * 显示物品详情
     */
    @RequestMapping(value="/ItemDetail",method= RequestMethod.GET)
    public ModelAndView publicItem(Model model) throws SQLException {
        //display drop down list info
        ModelAndView mav= itemDetailHelper.displayItemDetail("shop-item");
        return mav;
    }

}
