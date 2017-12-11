package cn.com.ibm.hackthon.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.ibm.hackthon.po.Behavior;

@ContextConfiguration(locations = { "classpath:/spring-mybatis.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class BehaviorServiceTest {
	@Autowired
	BehaviorSerice bs; 
	
	@Test
	public void selectBehaviorTest() {
		bs.selectBehavior(2, 1);
		
		Behavior behavior = new Behavior();
		behavior.setUserid(2);
		behavior.setItemid(1);
		behavior.setCounter(4);
		
		bs.updateBehavior(behavior);
	}
}
