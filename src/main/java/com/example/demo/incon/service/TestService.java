package com.example.demo.incon.service;

import com.example.demo.incon.entity.Test;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangyaodong
 * @since 2019-04-05
 */
public interface TestService extends IService<Test> {

    /**
     * 查询全部
     * @return 卡信息列表
     */
    List<Test> selectAll();
}
