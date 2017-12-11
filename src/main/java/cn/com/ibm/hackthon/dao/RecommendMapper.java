package cn.com.ibm.hackthon.dao;

import java.util.List;

import cn.com.ibm.hackthon.dto.ItemDTO;
import cn.com.ibm.hackthon.po.Item;
import cn.com.ibm.hackthon.po.Recommend;

public interface RecommendMapper {
    int insert(Recommend record);

    int insertSelective(Recommend record);

    List<Recommend> selectByUserId(int userId);
}