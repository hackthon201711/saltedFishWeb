package cn.com.ibm.hackthon.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.ibm.hackthon.dao.InterestMapper;
import cn.com.ibm.hackthon.dao.ItemMapper;
import cn.com.ibm.hackthon.dto.InterestDTO;
import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.po.Interest;

@Component
public class InterestServiceImpl implements InterestService{

	@Autowired
	private ItemMapper itemMapper;
	
	@Autowired
	private InterestMapper inMapper;
	@Override
	public int interestItem(Interest interest) throws SQLException{
		List<InterestDTO> list = inMapper.selectInteretByUserIdAndItemId(Integer.toString(interest.getItemId()),Integer.toString(interest.getItemId()));
		if(list!=null && list.size()>0) {
//			return 
		}
		inMapper.insert(interest);
		return 0;
	}

	@Override
	public List<ItemDTO> listInteretItemByUserId(String userId)  throws SQLException{
		return null;
	}

}
