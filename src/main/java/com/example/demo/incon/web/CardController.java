package com.example.demo.incon.web;


import com.example.demo.incon.entity.Card;
import com.example.demo.incon.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wangyaodong
 * @since 2019-04-05
 */
@RestController
@RequestMapping("/incon/card")
public class CardController {

    @Autowired
    private CardService cardService;

    /**
     * 自定义sql测试
     * @return 所有数据
     */
    @GetMapping(value = "/all")
    public List<Card> testMyMethod(){
        return cardService.selectAll();
    }

    /**
     * mybatis plus sql测试
     * @param cardId 卡主键 cardId
     * @return Card信息
     */
    @GetMapping(value = "/{cardId}")
    public Card selectById(@PathVariable int cardId){
        Card card = cardService.selectById(cardId);
        System.out.println(card == null);
        return card;
    }
}
