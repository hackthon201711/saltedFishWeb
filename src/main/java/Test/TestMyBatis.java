package Test;


import cn.com.ibm.hackthon.po.User;
import cn.com.ibm.hackthon.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = { "classpath:/spring-mybatis.xml" })

@RunWith(SpringJUnit4ClassRunner.class)
public class TestMyBatis extends AbstractJUnit4SpringContextTests {

    @Autowired
    private UserService userService;
//    @Before
//    public void init(){
//        context=new ClassPathXmlApplicationContext("/applicationContext.xml");
//        //userdao=(UserDAO) context.getBean("UserDAO");
//    }

    @Test
    public void getUserByName(){
        User user = userService.selectUserByName("panzer");
        System.out.println("user=====user");
    }


    @Test
    public void countAllUser(){
        int number=userService.countAllUser();
        System.out.println("number====="+number);
    }
}
