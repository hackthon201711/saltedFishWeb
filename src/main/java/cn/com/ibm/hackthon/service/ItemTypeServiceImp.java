package cn.com.ibm.hackthon.service;

import cn.com.ibm.hackthon.dao.ItemTypeMapper;
import cn.com.ibm.hackthon.po.ItemType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemTypeServiceImp implements ItemTypeService {

    @Autowired
    private ItemTypeMapper itemTypeMapper;
    public List getItemTypeList() {
        return itemTypeMapper.getAllItemType();
    }
}
