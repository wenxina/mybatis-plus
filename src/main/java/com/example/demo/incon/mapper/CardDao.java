package com.example.demo.incon.mapper;

import com.example.demo.incon.entity.Card;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangyaodong
 * @since 2019-04-05
 */
public interface CardDao extends BaseMapper<Card> {

    /**
     * 查询全部
     * @return 卡信息列表
     */
    List<Card> selectAll();
}
