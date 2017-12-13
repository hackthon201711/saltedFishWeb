package cn.com.ibm.hackthon.service;

import java.sql.SQLException;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.ibm.hackthon.po.Interest;

@ContextConfiguration(locations = { "classpath:/spring-mybatis.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class InterestServiceTest {
	@Autowired
	private InterestService inService;
	
	@Test
	public void testInsert() throws SQLException {
		Interest in = new Interest();
		in.setUserid(1);
		in.setItemId(3);
		in.setCreateTime(new Date());
		System.out.println(inService.interestItem(in));
	}
	
	@Test
	public void testShowInterestItem() throws SQLException {
		inService.listInteretItemByUserId("1");
	}
}
