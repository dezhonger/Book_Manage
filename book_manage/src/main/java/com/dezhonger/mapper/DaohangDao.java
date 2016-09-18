package com.dezhonger.mapper;

import com.dezhonger.entity.Daohang;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zwl on 2016/9/18.
 */
@Repository
public interface DaohangDao {
    List<Daohang> getAllDaohang();
    int insert(Daohang daohang);
}
