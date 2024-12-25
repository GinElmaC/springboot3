package com.ginelmac.springboot3.service;

import com.ginelmac.springboot3.Bean.Vip;

import java.util.List;

public interface VipService {
    boolean save(Vip vip);
    List<Vip> selectAll();
}
