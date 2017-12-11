package cn.com.ibm.hackthon.service;


import cn.com.ibm.hackthon.dao.BehaviorMapper;
import cn.com.ibm.hackthon.dao.UserMapper;
import cn.com.ibm.hackthon.po.Behavior;
import cn.com.ibm.hackthon.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BehaviorServiceImp implements BehaviorSerice {
    @Autowired
    private BehaviorMapper BehaviorDAO;

	@Override
	public Behavior selectBehavior(int userid, int itemid) {
		// TODO Auto-generated method stub
		return BehaviorDAO.selectBehavior(userid, itemid);
	}


	@Override
	public void addNewBehavior(Behavior behavior) {
		BehaviorDAO.addNewBehavior(behavior);
		
	}


	@Override
	public void updateBehavior(Behavior behavior) {
		BehaviorDAO.updateBehavior(behavior);
		
	}

}
