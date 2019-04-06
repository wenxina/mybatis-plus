package com.example.demo.incon.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.incon.entity.Card;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangyaodong
 * @since 2019-04-05
 */
public interface CardService extends IService<Card> {

    /**
     * 查询全部
     * @return 卡信息列表
     */
    List<Card> selectAll();
}
