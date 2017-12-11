package cn.com.ibm.hackthon.controller.helper;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.ibm.hackthon.dao.UserMapper;
import cn.com.ibm.hackthon.po.Behavior;
import cn.com.ibm.hackthon.po.User;
import cn.com.ibm.hackthon.service.BehaviorSerice;
import cn.com.ibm.hackthon.service.UserService;


@Component("BehaviorHelper")
public class BehaviorControllerHelper {
	
	@Resource 
	private BehaviorSerice behaviorSerice;
	@Resource
	private UserService userService;

	public void addOrupdateBehavior(String userID,int itemId) {
		
		User user = userService.selectUserByName(userID);
		Behavior behavior = new Behavior();
		behavior = behaviorSerice.selectBehavior(user.getUserid(), itemId);
		if (behavior != null) {
			behavior.setCounter(behavior.getCounter() + 1);
			behaviorSerice.updateBehavior(behavior);
		}else {
			Behavior behavior1 = new Behavior();
			behavior1.setUserid(user.getUserid());
			behavior1.setItemid(itemId);
			behavior1.setCounter(1);
			behaviorSerice.addNewBehavior(behavior1);
		}
		
	}
}
