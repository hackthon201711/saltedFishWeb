package cn.com.ibm.hackthon.service;

import java.sql.SQLException;
import java.util.List;

import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.po.Interest;

public interface InterestService {
	/**
	 * 对商品感兴趣
	 * @return
	 */
	int interestItem(Interest interest) throws SQLException;
	
	/**
	 * 列出用户感兴趣的商品
	 * @param userId
	 * @return
	 */
	List<ItemDTO> listInteretItemByUserId(String userId) throws SQLException;
}
