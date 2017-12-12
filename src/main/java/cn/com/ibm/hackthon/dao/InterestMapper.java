package cn.com.ibm.hackthon.dao;

import java.util.List;

import cn.com.ibm.hackthon.dto.InterestDTO;
import cn.com.ibm.hackthon.po.Interest;

public interface InterestMapper {
    int insert(Interest record);

    int insertSelective(Interest record);
    
    List<InterestDTO> selectInteretByUserIdAndItemId(String userId,String itemId);
}