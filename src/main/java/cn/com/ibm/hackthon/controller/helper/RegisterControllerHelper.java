package cn.com.ibm.hackthon.controller.helper;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.ibm.hackthon.dao.UserMapper;
import cn.com.ibm.hackthon.po.User;
import cn.com.ibm.hackthon.service.UserService;


@Component("regHelper")
public class RegisterControllerHelper {
	
	@Resource 
	private UserService userService;

	public int constructUser(String userID,String psw1,String psw2,String nickName,String email,String telephone) {
		
		User user = new User();
		user.setLoginname(userID);
		if(!psw1.equals(psw2)) {
			System.out.println("input PSW not same!");
		}
		user.setPwd(psw1);
		user.setLocationId(0);
		user.setProfilePicId(0);
		user.setGender(0);
		user.setEmail(email);
		user.setPhone(telephone);
		user.setUsername(nickName);
		user.setCreateTime(new Date());
		user.setLastChangeTime(new Date());
		
		int RCcode = userService.createNewUser(user);
		
		return RCcode;
		
	}
}
