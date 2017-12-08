package cn.com.ibm.hackthon.service;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;
import cn.com.ibm.hackthon.dao.ItemMapper;
import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.po.Item;
import cn.com.ibm.hackthon.po.ItemExample;

@Component
public class ItemServiceImpl implements ItemService{

	/**
	 * logger
	 */
	org.slf4j.Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);
			
	@Autowired
	private ItemMapper itemMapper; 
	

	public List<ItemDTO> getNewArrivalItemList() {
		logger.info("getNewArrivalItemList() called ");
		ItemExample ie = new ItemExample();
		ie.setDistinct(false);
		ie.setOrderByClause("create_time");
		return itemMapper.selectItemList(ie);
	}


	public List<ItemDTO> getHotItemList() {
		return itemMapper.selectHotItemList();
	}

	public int insertItem(Item item)throws SQLException {
		return itemMapper.insertItem(item);
	}

	public void deleteItemById(int id)throws SQLException {
		itemMapper.deleteItemById(id);
	}

	public List<ItemDTO> selectItemListByUser(String username,int status,int pic_typ) throws SQLException {
		return itemMapper.selectItemWithMainPicByUserId(username,status,pic_typ);
	}

	public List<Item> selectItemByUserName(String username, int itemid) throws SQLException {
		return itemMapper.selectItemByUserName(username,itemid);
	}


}
