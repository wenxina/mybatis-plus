package com.example.demo.incon.service.impl;

import com.example.demo.incon.entity.Test;
import com.example.demo.incon.mapper.TestDao;
import com.example.demo.incon.service.TestService;
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
public class TestServiceImpl extends ServiceImpl<TestDao, Test> implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public List<Test> selectAll() {
        return testDao.selectAll();
    }
}
