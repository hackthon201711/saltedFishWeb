package cn.com.ibm.hackthon.service;


import cn.com.ibm.hackthon.po.Behavior;

import org.springframework.stereotype.Repository;


public interface BehaviorSerice {

    Behavior selectBehavior(int userid,int itemid);
    
    void addNewBehavior(Behavior behavior);
    
    void updateBehavior(Behavior behavior);
}
