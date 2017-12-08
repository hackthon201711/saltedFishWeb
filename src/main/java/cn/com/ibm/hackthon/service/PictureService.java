package cn.com.ibm.hackthon.service;

import cn.com.ibm.hackthon.po.Picture;

import java.sql.SQLException;
import java.util.List;

public interface PictureService {
    int generateNewPicturePath(Picture picture);

    List<Picture> getPictureList(int itemid)throws SQLException;
}
