package cn.com.ibm.hackthon.service;

import cn.com.ibm.hackthon.po.Picture;

public interface PictureService {
    int generateNewPicturePath(Picture picture);
}
