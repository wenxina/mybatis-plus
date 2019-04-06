package com.example.demo.incon.service.impl;

import com.example.demo.incon.entity.Card;
import com.example.demo.incon.mapper.CardDao;
import com.example.demo.incon.service.CardService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangyaodong
 * @since 2019-04-05
 */
@Service
public class CardServiceImpl extends ServiceImpl<CardDao, Card> implements CardService {

    @Autowired
    private CardDao cardDao;

    @Override
    public List<Card> selectAll() {
        return cardDao.selectAll();
    }
}
