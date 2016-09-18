package com.dezhonger.entity;

/**
 * Created by zwl on 2016/9/18.
 */
public class Daohang {
    private Integer id;
    private String name;
    private String url;
    private String picture = "";
    private String comment = "";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Daohang{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", picture='" + picture + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
