package com.dezhonger.entity;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by dezhonger on 2016/8/29.
 */
public class MapiVipActivity implements Serializable {
    private static final long serialVersionUID = -1L;

    private Integer id;
    private Integer userId;
    private Date createTime;
    private Date updateTime;
    private char isNotify;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public char getIsNotify() {
        return isNotify;
    }

    public void setIsNotify(char isNotify) {
        this.isNotify = isNotify;
    }




    @Override
    public String toString() {
        return "MapiVipActivity{" +
                "id=" + id +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isNotify=" + isNotify +
                '}';
    }
}
