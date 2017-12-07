package Test;


import cn.com.ibm.hackthon.po.Picture;
import cn.com.ibm.hackthon.po.User;
import cn.com.ibm.hackthon.service.ItemService;
import cn.com.ibm.hackthon.service.LocationService;
import cn.com.ibm.hackthon.service.PictureService;
import cn.com.ibm.hackthon.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@ContextConfiguration(locations = { "classpath:/spring-mybatis.xml" })

@RunWith(SpringJUnit4ClassRunner.class)
public class TestMyBatis extends AbstractJUnit4SpringContextTests {

    @Autowired
    private UserService userService;
    @Autowired
    private PictureService pictureService;
    @Autowired
    private LocationService locationService;
    @Autowired
    private ItemService itemService;
//    @Before
//    public void init(){
//        context=new ClassPathXmlApplicationContext("/applicationContext.xml");
//        //userdao=(UserDAO) context.getBean("UserDAO");
//    }


    public void getUserByName(){
        User user = userService.selectUserByName("panzer");
        System.out.println("user=====user");
    }



    public void countAllUser(){
        int number=userService.countAllUser();
        System.out.println("number====="+number);
    }
    
    public void TestAddNewUser(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = df.format(new Date());
        User user=new User();
        user.setCreateTime(new Date());
        user.setLastChangeTime(new Date());
        user.setEmail("1231@aliyun.com");
        user.setGender(0);
        user.setLocationId(5101);
        user.setLoginname("StGVI");
        user.setPhone("13308201112");
        user.setPwd("adming123");
        user.setProfilePicId(1);
        user.setUsername("咸鱼2号");
        int id=userService.createNewUser(user);
        System.out.println("number====="+id);
    }


    public void testAddNewPicturePath(){
        Picture picture=new Picture();
        picture.setItemId(1);
        picture.setPicutureType(0);
        picture.setPicPath("/upload/01/qqq.jpg");
        picture.setCreateTime(new Date());
        picture.setChangeTime(new Date());
        int id=pictureService.generateNewPicturePath(picture);
    }

    @Test
    public  void testListForItem(){
        List list= null;
        try {
            list = itemService.selectItemListByUser(1,0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("list=================="+list);
    }



}
