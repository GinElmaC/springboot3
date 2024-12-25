package com.ginelmac.springboot3.repository;

import com.ginelmac.springboot3.Bean.Vip;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VipMapper {
    List<Vip> getall();
}