package cn.com.ibm.hackthon.dao;

import cn.com.ibm.hackthon.po.Behavior;
import cn.com.ibm.hackthon.po.BehaviorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BehaviorMapper {
    int insert(Behavior record);

    int insertSelective(Behavior record);

    List<Behavior> selectByExample(BehaviorExample example);

    int updateByExampleSelective(@Param("record") Behavior record, @Param("example") BehaviorExample example);

    int updateByExample(@Param("record") Behavior record, @Param("example") BehaviorExample example);
    
    Behavior selectBehavior(int userid,int itemid); 
    
    void addNewBehavior(Behavior behavior);
    void updateBehavior(Behavior behavior);
}