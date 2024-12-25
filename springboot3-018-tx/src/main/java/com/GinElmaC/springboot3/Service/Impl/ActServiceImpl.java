package com.GinElmaC.springboot3.Service.Impl;

import com.GinElmaC.springboot3.Bean.Act;
import com.GinElmaC.springboot3.Dao.ActDao;
import com.GinElmaC.springboot3.Exception.NomoneyException;
import com.GinElmaC.springboot3.Service.ActService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("actService")
public class ActServiceImpl implements ActService {
    @Autowired
    private ActDao actDao;

    @Transactional
    @Override
    public void transmoney(String fromActno, String toActno, double money) {
        Act actfrom = actDao.selectByActno(fromActno);
        if(actfrom.getBalance()<money){
            throw new NomoneyException("金额不足");
        }else{
            Act actto = actDao.selectByActno(toActno);
            actfrom.setBalance(actfrom.getBalance()-money);
            actto.setBalance(actto.getBalance()+money);
            int a = actDao.modify(actfrom);
            int b = actDao.modify(actto);
            if(a+b!=2){
                throw new NomoneyException("未知错误");
            }
        }
    }
}
