package cn.com.ibm.hackthon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.ibm.hackthon.dao.ItemMapper;
import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.po.ItemExample;

@Component
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemMapper itemMapper; 
	
	@Override
	public List<ItemDTO> getNewArrivalItemList() {
		ItemExample ie = new ItemExample();
		ie.setDistinct(false);
		ie.setOrderByClause("create_time");
//		return itemMapper.selectByExample(ie);
		return null;
	}

	@Override
	public List<ItemDTO> getHotItemList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
