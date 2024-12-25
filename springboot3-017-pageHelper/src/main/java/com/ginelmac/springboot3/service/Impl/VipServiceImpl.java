package com.ginelmac.springboot3.service.Impl;

import com.ginelmac.springboot3.Bean.Vip;
import com.ginelmac.springboot3.repository.VipMapper;
import com.ginelmac.springboot3.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("vipService")
public class VipServiceImpl implements VipService {
    @Autowired
    private VipMapper vipMapper;
    @Override
    public List<Vip> findAll() {
        return vipMapper.getall();
    }
}
