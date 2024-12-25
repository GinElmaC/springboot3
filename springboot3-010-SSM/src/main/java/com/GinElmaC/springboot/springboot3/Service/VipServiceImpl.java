package com.GinElmaC.springboot.springboot3.Service;

import com.GinElmaC.springboot.springboot3.Bean.Vip;
import com.GinElmaC.springboot.springboot3.repository.VipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("VipService")
public class VipServiceImpl implements VipService{
    @Autowired
    private VipMapper vipMapper;

    @Override
    public Vip findById(Long id) {
        return vipMapper.selectByPrimaryKey(id);
    }
}
