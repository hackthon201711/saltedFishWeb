package cn.com.ibm.hackthon.controller;


import cn.com.ibm.hackthon.controller.helper.ItemAddControllerHelper;

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
import java.io.File;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/file")
public class ItemAddController {
    private static final Log logger = LogFactory.getLog(ItemAddController.class);


    @Resource
    ItemAddControllerHelper pictureUploadHelper;

    @Autowired
    private LocationService locationService;


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
                    picture.setPicutureType(0);
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
        ModelAndView mav = new ModelAndView("public-item");

        List li= locationService.getLocation();

        List outlist=new ArrayList<String>();
        System.out.println("Get location info from database"+li.toString());
        for(int i=0;i<li.size();i++){
            Location lo= (Location) li.get(i);
            outlist.add(lo.getLocationName());
            System.out.println("=============="+outlist.toString());
        }

        mav.addObject("LocationList", li);
        return mav;
    }



}
