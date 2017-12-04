package cn.com.ibm.hackthon.service;


import cn.com.ibm.hackthon.po.User;
import org.springframework.stereotype.Repository;


public interface UserService {
    User selectUserByName(String loginname);

    int countAllUser();
}
