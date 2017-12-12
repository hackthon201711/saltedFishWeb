package cn.com.ibm.hackthon.controller;


import cn.com.ibm.hackthon.controller.helper.ItemAddControllerHelper;
import cn.com.ibm.hackthon.controller.helper.loginControllerHelper;
import cn.com.ibm.hackthon.po.Item;
import cn.com.ibm.hackthon.po.Location;
import cn.com.ibm.hackthon.po.Picture;
import cn.com.ibm.hackthon.po.User;
import cn.com.ibm.hackthon.service.LocationService;
import cn.com.ibm.hackthon.service.UserService;
import cn.com.ibm.hackthon.util.Constant;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.peer.SystemTrayPeer;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

/**
 * 添加物品
 */
@Controller
@RequestMapping("/file")
public class ItemAddController {
    private static final Log logger = LogFactory.getLog(ItemAddController.class);


    @Resource
    ItemAddControllerHelper pictureUploadHelper;
    
	@Resource 
	private UserService userService;



    /**
     * 进入添加物品页面
     * 显示地区信息和物品类别
     */

    @RequestMapping(value="/publicItem",method=RequestMethod.GET)
    public ModelAndView publicItem(Model model) {
        //display drop down list info
        ModelAndView mav= pictureUploadHelper.GenerateListForAddItemPage("public-item");

        return mav;
    }


    /**
     * 点击发布商品之后的跳转方法
     * @param preprice
     * @param curprice
     * @param itemName
     * @param itemDec
     * @param locationid
     * @param typeid
     * @param files
     * @param request
     * @param response
     * @param session
     * @return
     * @throws SQLException
     */
    @RequestMapping(value="/addnewItem",method=RequestMethod.POST)
    public String AddItemTest(String preprice,String curprice,String itemName,String itemDec,Integer locationid,Integer typeid,@RequestParam("files") MultipartFile[] files, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws SQLException {
    	
    	String userID = (String) session.getAttribute("userID");
    	User user = userService.selectUserByName(userID);
    	
        String fileName = null;
        Item newitem=new Item();
        newitem.setUserId(user.getUserid());
        newitem.setCreateTime(new Date());
        newitem.setLastChangeTime(new Date());
        newitem.setCurPrice(Long.parseLong(curprice));
        newitem.setPrePrice(Long.parseLong(preprice));
        newitem.setItemDesc(itemDec);
        newitem.setItemName(itemName);
        newitem.setStatus(0);
        newitem.setItemTypeId(typeid);
        newitem.setLocationId(locationid);
        System.out.println("locationid====="+locationid);

        int itemid=pictureUploadHelper.generateNewItem(newitem);

        //upload the picture

        if(files!=null&&files.length>0&&itemid>=0) {
            for (int i = 0; i < files.length; i++) {
                MultipartFile file = files[i];
                try {
                    fileName = pictureUploadHelper.UploadfiletoServer(file, request, response, session);
                } catch (IOException e) {
                    e.printStackTrace();
                    return "Upload picture to server feild";
                }
                if (fileName != null) {

                    Picture picture = new Picture();
                    picture.setItemId(itemid);
                    //默认第一个上传的为主图
                    if (i==0){
                        picture.setPicutureType(0);
                    }else{
                        picture.setPicutureType(1);
                    }

                    picture.setPicPath(fileName);
                    picture.setCreateTime(new Date());
                    picture.setChangeTime(new Date());
                    try {
                        int id = pictureUploadHelper.AddNewPicturePath(picture);
                    } catch (Exception e) {
                        //如果插入图片名字失败 删除刚刚上传的图片 并且删除物品记录
                        File dfile = new File(Constant.PICTURE_STROE_ADDREES+fileName);
                        dfile.delete();
                        pictureUploadHelper.deleteItemById(itemid);
                        e.printStackTrace();
                    }
                }
            }
        }
        //返回页面未定义
        return "redirect:/page_index";
    }


}
