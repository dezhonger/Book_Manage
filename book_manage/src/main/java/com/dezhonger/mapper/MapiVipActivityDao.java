package com.dezhonger.mapper;

import com.dezhonger.entity.MapiVipActivity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by dezhonger on 2016/8/29.
 */
@Repository
public interface MapiVipActivityDao {
    public int updateStatus(@Param("userId") Integer userId, @Param("isNotify") Character isNotify, @Param("updateTime") Date updateTime);
    public int insertStatus(MapiVipActivity mapiVipActivity);
    public MapiVipActivity selectStatus(@Param("userId") Integer userId);
    public List<Integer> getAllUserNeedNotify();
}
