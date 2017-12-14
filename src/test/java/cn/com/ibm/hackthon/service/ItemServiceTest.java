package cn.com.ibm.hackthon.service;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.qos.logback.classic.Logger;
import cn.com.ibm.hackthon.dto.ItemDTO;

@ContextConfiguration(locations = { "classpath:/spring-mybatis.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class ItemServiceTest {

	@Resource
	private ItemService itemService;
	
	@Test
	public void testGetNewArrivalItemList() throws SQLException {
		List<ItemDTO> list = itemService.getNewArrivalItemList();
		for (ItemDTO itemDTO : list) {
			System.out.println(itemDTO);
		}
	}
	

	@Test
	public void testGetHostItemList() throws SQLException {
		List<ItemDTO> list = itemService.getHotItemList();
		for (ItemDTO itemDTO : list) {
			System.out.println(itemDTO);
		}
	}
	
	@Test
	public void testGetRecommendItemList() throws SQLException {
		itemService.getRecommendItemList("12");
//		List<ItemDTO> list = itemService.getRecommendItemList("2");
//		for (ItemDTO itemDTO : list) {
//			System.out.println(itemDTO);
//		}
	}
}
