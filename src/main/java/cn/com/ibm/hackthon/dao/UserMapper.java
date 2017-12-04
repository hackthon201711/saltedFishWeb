package cn.com.ibm.hackthon.dao;

import cn.com.ibm.hackthon.po.User;
import cn.com.ibm.hackthon.po.UserExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository(value="UserMapper")
public interface UserMapper {
    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> getUserByName(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    public int createNewUser(User user);

    public int countAllUser();

    public User getUserByName(String name);
}