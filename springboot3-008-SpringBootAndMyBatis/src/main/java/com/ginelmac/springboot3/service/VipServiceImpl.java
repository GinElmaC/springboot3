package com.ginelmac.springboot3.service;

import com.ginelmac.springboot3.Bean.Vip;
import com.ginelmac.springboot3.repository.VipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("VipService")
public class VipServiceImpl implements VipService{
    @Autowired
    private VipMapper vipMapper;
    @Override
    public boolean save(Vip vip) {
        return vipMapper.insert(vip)==1;
    }

    @Override
    public List<Vip> selectAll() {
        return vipMapper.selectAll();
    }
}
