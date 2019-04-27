package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class LuckymoneyService {

    @Autowired
    private LuckymoneyRepository repository;

    @Transactional
    public void createTwo(){
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setProducer("dodannie");
        luckymoney1.setMoney(new BigDecimal("520"));
        repository.save(luckymoney1);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("dodannie");
        luckymoney2.setMoney(new BigDecimal("1314"));
        repository.save(luckymoney2);
    }
}
