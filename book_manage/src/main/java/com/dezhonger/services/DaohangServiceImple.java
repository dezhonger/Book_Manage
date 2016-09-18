package com.dezhonger.services;

import com.dezhonger.entity.Daohang;
import com.dezhonger.mapper.DaohangDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by zwl on 2016/9/18.
 */
@Service
public class DaohangServiceImple implements DaohangService{
    @Autowired
    DaohangDao daohangDao;
    public List<Daohang> getAllDaohang() {
        return daohangDao.getAllDaohang();
    }

    public int insert(Daohang daohang) {
        if(!StringUtils.isEmpty(daohang.getName()) && !StringUtils.isEmpty(daohang.getUrl())) {
            return daohangDao.insert(daohang);
        } else {
            return -1;
        }
    }
}
