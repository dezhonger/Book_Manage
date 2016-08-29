package com.dezhonger.services;

import com.dezhonger.entity.MapiVipActivity;

import java.util.List;

/**
 * Created by zwl on 2016/8/29.
 */
public interface MapiVipActivityService {
    public void changeStatus(Integer userId, char status);
    public MapiVipActivity getStatus(Integer userId);
    public List<Integer> getAllUserNeedNotify();
}
