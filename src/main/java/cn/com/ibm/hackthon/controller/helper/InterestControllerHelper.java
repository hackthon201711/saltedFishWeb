package cn.com.ibm.hackthon.controller.helper;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.ibm.hackthon.dto.InterestDTO;
import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.po.Interest;
import cn.com.ibm.hackthon.service.InterestService;

@Component
public class InterestControllerHelper {
	@Autowired
	private InterestService inService;
	/**
	 * 
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	public int interetInItem(InterestDTO dto) throws SQLException {
		Interest interest = new Interest();
		
		interest.setItemId(Integer.valueOf(dto.getItemId()) );
		interest.setUserid(Integer.valueOf(dto.getUserId()));
		return inService.interestItem(interest);
	}
	
	/**
	 * 选择我关注的商品
	 * @param userId
	 * @return
	 * @throws SQLException
	 */
	public List<ItemDTO> selectInterestItemList(String userId) throws SQLException{
		return inService.listInteretItemByUserId(userId);
	}
}
