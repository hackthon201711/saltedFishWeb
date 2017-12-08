package cn.com.ibm.hackthon.dao;

import cn.com.ibm.hackthon.po.Picture;

import java.sql.SQLException;
import java.util.List;

public interface PictureMapper {
    //int insert(Picture record);

    int insertPicture(Picture record);

    List<Picture> selectPictureByItem(int item_id)throws SQLException;
}