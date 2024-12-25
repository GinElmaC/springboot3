package com.ginelmac.springboot3.repository;

import com.ginelmac.springboot3.Bean.Vip;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface VipMapper {
    int insert(Vip vip);
    List<Vip> selectAll();
}
