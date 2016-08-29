package com.dezhonger.services;

import com.dezhonger.entity.MapiVipActivity;
import com.dezhonger.mapper.MapiVipActivityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by zwl on 2016/8/29.
 */
@Service
public class MapiVipActivityServiceImpl implements MapiVipActivityService{
    @Autowired
    MapiVipActivityDao mapiVipActivityDao;

    public void changeStatus(Integer userId, char status) {
        if(userId != null) {
            if(mapiVipActivityDao.selectStatus(userId) != null) {
                mapiVipActivityDao.updateStatus(userId, status, new Date());
            } else {
                MapiVipActivity mapiVipActivity = new MapiVipActivity();
                mapiVipActivity.setUserId(userId);
                mapiVipActivity.setCreateTime(new Date());
                mapiVipActivity.setUpdateTime(new Date());
                mapiVipActivity.setIsNotify(status);
                mapiVipActivityDao.insertStatus(mapiVipActivity);
            }
        }
    }
    public MapiVipActivity getStatus(Integer userId) {
        if(userId != null) {
            return mapiVipActivityDao.selectStatus(userId);
        }
        return null;
    }

    public List<Integer> getAllUserNeedNotify() {
        return mapiVipActivityDao.getAllUserNeedNotify();
    }
}
