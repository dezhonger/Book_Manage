package com.dezhonger.services;

import com.dezhonger.entity.Daohang;

import java.util.List;

/**
 * Created by zwl on 2016/9/18.
 */
public interface DaohangService {
    List<Daohang> getAllDaohang();
    int insert(Daohang daohang);
}
