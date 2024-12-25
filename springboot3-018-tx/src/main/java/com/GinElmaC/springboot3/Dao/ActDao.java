package com.GinElmaC.springboot3.Dao;

import com.GinElmaC.springboot3.Bean.Act;
import org.springframework.stereotype.Component;

@Component
public interface ActDao {
    Act selectByActno(String actno);
    int modify(Act act);
}
