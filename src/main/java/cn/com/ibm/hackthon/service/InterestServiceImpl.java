package cn.com.ibm.hackthon.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.ibm.hackthon.dao.InterestMapper;
import cn.com.ibm.hackthon.dao.ItemMapper;
import cn.com.ibm.hackthon.dto.InterestDTO;
import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.po.Interest;
import cn.com.ibm.hackthon.util.Constant;

@Component
public class InterestServiceImpl implements InterestService{

	@Autowired
	private ItemMapper itemMapper;
	
	@Autowired
	private InterestMapper inMapper;
	@Override
	public int interestItem(Interest interest) throws SQLException{
		List<InterestDTO> list = inMapper.selectInteretByUserIdAndItemId(Integer.toString(interest.getUserid()),Integer.toString(interest.getItemId()));
		//if interest item found
		if(list!=null && list.size()>0) {
			return Constant.INTEREST_ITEM_FOUND;
		}
		interest.setCreateTime(new Date());//set current 
		inMapper.insert(interest);
		return Constant.INTEREST_ITEM_NOT_FOUND;
	}

	@Override
	public List<ItemDTO> listInteretItemByUserId(String userId)  throws SQLException{
		return itemMapper.selectInterestedItemByUserId(userId);
	}

}
