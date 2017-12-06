package cn.com.ibm.hackthon.service;

import cn.com.ibm.hackthon.dao.PictureMapper;
import cn.com.ibm.hackthon.po.Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PictureServiceImp implements PictureService {
    @Autowired
    private PictureMapper pictureMapper;

    public int generateNewPicturePath(Picture picture) {
        return  pictureMapper.insertPicture(picture);
    }
}
