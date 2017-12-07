package cn.com.ibm.hackthon.service;

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
	public void testGetNewArrivalItemList() {
		List<ItemDTO> list = itemService.getNewArrivalItemList();
		for (ItemDTO itemDTO : list) {
			System.out.println(itemDTO.getId());
		}
	}
}
