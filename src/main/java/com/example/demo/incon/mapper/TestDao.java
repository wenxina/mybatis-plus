package com.example.demo.incon.mapper;

import com.example.demo.incon.entity.Test;
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
public interface TestDao extends BaseMapper<Test> {

    /**
     * 查询全部
     * @return 信息列表
     */
    List<Test> selectAll();
}
