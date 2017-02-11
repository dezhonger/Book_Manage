package com.dezhonger.result;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Dezhonger on 2017/2/12.
 */
public class Test1Result implements Serializable {

    private static final long serialVersionUID = -1L;
    private String name;
    private int age;
    private Date date;
    private Date createTime;
    private Date updateTime;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    @Override
    public String toString() {
        return "Test1Result{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
