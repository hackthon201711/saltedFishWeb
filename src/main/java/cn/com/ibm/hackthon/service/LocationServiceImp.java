package cn.com.ibm.hackthon.service;

import cn.com.ibm.hackthon.dao.LocationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImp implements LocationService {


    @Autowired
    private LocationMapper locationMapper;
    public List getLocation() {
        return locationMapper.getAllLocation();
    }
}
