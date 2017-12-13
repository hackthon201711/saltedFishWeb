package cn.com.ibm.hackthon.controller.helper;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.ibm.hackthon.dao.UserMapper;
import cn.com.ibm.hackthon.po.User;
import cn.com.ibm.hackthon.service.UserService;


@Component("loginHelper")
public class loginControllerHelper {
	
	@Resource 
	private UserService userService;

	public User checkAuth(String userID,String passWord) {
		
		return userService.selectUserByName(userID);
//		if(!user.getPwd().equals(passWord)) {
//
//			return false;
//		}
//		
//		return true;
		
	}
}
