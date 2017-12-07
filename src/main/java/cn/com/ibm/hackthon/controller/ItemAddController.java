package cn.com.ibm.hackthon.controller;


import cn.com.ibm.hackthon.controller.helper.ItemAddControllerHelper;

import cn.com.ibm.hackthon.po.Item;
import cn.com.ibm.hackthon.po.Location;
import cn.com.ibm.hackthon.po.Picture;
import cn.com.ibm.hackthon.service.LocationService;
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
import java.util.*;

@Controller
@RequestMapping("/file")
public class ItemAddController {
    private static final Log logger = LogFactory.getLog(ItemAddController.class);


    @Resource
    ItemAddControllerHelper pictureUploadHelper;




    @ResponseBody
    @RequestMapping(value = "/pictureUpload")
    //上传图片到服务器 并且往t_picture表里面插入一条记录记录path
    public String addNewItem(@RequestParam("files") MultipartFile[] files, HttpServletRequest request, HttpServletResponse response, HttpSession session)  {
        System.out.println("upload start");
        String path = null;
        if(files!=null&&files.length>0) {
            for (int i = 0; i < files.length; i++) {
                MultipartFile file = files[i];
                try {
                    path = pictureUploadHelper.UploadfiletoServer(file, request, response, session);
                } catch (IOException e) {
                    e.printStackTrace();
                    return "Upload picture to server feild";
                }
                if (path != null) {
                    //测试代码
                    Picture picture = new Picture();
                    picture.setItemId(1);
                    if (i==0){
                        picture.setPicutureType(0);
                    }else{
                        picture.setPicutureType(1);
                    }

                    picture.setPicPath(path);
                    picture.setCreateTime(new Date());
                    picture.setChangeTime(new Date());
                    try {
                        int id = pictureUploadHelper.AddNewPicturePath(picture);
                    } catch (Exception e) {
                        //如果插入path失败 删除刚刚上传的图片
                        File dfile = new File(path);
                        dfile.delete();
                        e.printStackTrace();
                    }
                }
            }
        }

        return "redirect:/list.html";
    }

    /**
     * 显示地区信息
     */

    @RequestMapping(value="/publicItem",method=RequestMethod.GET)
    public ModelAndView publicItem(Model model) {
        //display drop down list info
        ModelAndView mav= pictureUploadHelper.GenerateListForAddItemPage("public-item");

        return mav;
    }

    @RequestMapping(value="/addnewItem",method=RequestMethod.POST)
    public String AddItemTest(String preprice,String curprice,String itemName,String itemDec,int locationid,int typeid,@RequestParam("files") MultipartFile[] files, HttpServletRequest request, HttpServletResponse response, HttpSession session){
       //insert item table first
        System.out.println("itemName============"+itemName);
        System.out.println("itemDec============"+itemDec);
        System.out.println("locationid============"+locationid);
        System.out.println("typeid============"+typeid);
        if(files!=null&&files.length>0) {
            System.out.println("files========not null");
        }
        Item newitem=new Item();
        newitem.setCreateTime(new Date());
        newitem.setLastChangeTime(new Date());
        newitem.setCurPrice(Long.parseLong(curprice));
        newitem.setPrePrice(Long.parseLong(preprice));
        newitem.setItemDesc(itemDec);
        newitem.setItemName(itemName);
        newitem.setStatus(0);
        newitem.setItemTypeId(typeid);
        newitem.setLocationId(locationid);
        System.out.println("load po finish");
        //upload the picture


        return "ok";
    }


}
