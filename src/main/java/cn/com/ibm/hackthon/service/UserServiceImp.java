package cn.com.ibm.hackthon.service;


import cn.com.ibm.hackthon.dao.UserMapper;
import cn.com.ibm.hackthon.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userDAO;

    public User selectUserByName(String loginname) {
        return userDAO.getUserByName(loginname);
    }


    public int countAllUser() {
        return userDAO.countAllUser();
    }


    public int createNewUser(User user) {
        return userDAO.generateNewUser(user);
    }
}
