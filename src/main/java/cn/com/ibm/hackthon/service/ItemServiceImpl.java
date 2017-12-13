package cn.com.ibm.hackthon.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.resource.spi.AuthenticationMechanism;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;
import cn.com.ibm.hackthon.dao.ItemMapper;
import cn.com.ibm.hackthon.dao.RecommendMapper;
import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.dto.ItemRateDTO;
import cn.com.ibm.hackthon.po.Item;
import cn.com.ibm.hackthon.po.ItemExample;
import cn.com.ibm.hackthon.po.Recommend;
import cn.com.ibm.hackthon.util.Constant;
import cn.com.ibm.hackthon.util.StringUtil;

@Component
public class ItemServiceImpl implements ItemService{

	/**
	 * logger
	 */
	org.slf4j.Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);
			
	@Autowired
	private ItemMapper itemMapper; 
	

	@Autowired
	RecommendMapper recommendMapper;
	public List<ItemDTO> getNewArrivalItemList() throws SQLException{
		logger.info("getNewArrivalItemList() called ");
		ItemExample ie = new ItemExample();
		ie.setDistinct(false);
		ie.setOrderByClause("create_time");
		return itemMapper.selectItemList(ie);
	}


	public List<ItemDTO> getHotItemList() throws SQLException{
		return itemMapper.selectHotItemList();
	}

	public int insertItem(Item item)throws SQLException {
		itemMapper.insertItem(item);
		return item.getItemId();
	}

	public void deleteItemById(int id)throws SQLException {
		itemMapper.deleteItemById(id);
	}

	public List<ItemDTO> selectItemListByUser(String username,int status,int pic_typ) throws SQLException {
		return itemMapper.selectItemWithMainPicByUserId(username,status,pic_typ);
	}

	public List<Item> selectItemByUserName(int itemid) throws SQLException {
		return itemMapper.selectItemByUserName(itemid);
	}


	public List<ItemDTO> getRecommendItemList(String userId) throws SQLException {
		
		List<Recommend> recommList = recommendMapper.selectByUserId(new Integer(userId));
		if(recommList==null) {
			return null;
		}
		StringBuffer sb = new StringBuffer();
		for (int i =0;i<recommList.size();i++) {
			if(i>0) {
				sb.append(Constant.SYMBOL_COMMA);
			}
			sb.append(recommList.get(i).getItemid());
			i++;
		}
		List<ItemRateDTO> irDTOList = StringUtil.parseStrToList(sb.toString());
		if(irDTOList==null) {
			return null;
		}
		List<String> itemList = new ArrayList<>();
		for (int j=0;j<irDTOList.size();j++ ) {
//			if(j>0) {
//				sb.append(Constant.SYMBOL_COMMA);
//			}
//			sb.append(irDTOList.get(j).getItemId());
			itemList.add(irDTOList.get(j).getItemId());
		}
		return itemMapper.selectItemByItemIds(itemList);
	}


}
