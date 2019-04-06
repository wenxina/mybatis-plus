package com.example.demo.incon.web;


import com.example.demo.incon.entity.Test;
import com.example.demo.incon.service.TestService;
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
@RequestMapping("/incon/test")
public class TestController {

    @Autowired
    private TestService testService;

    /**
     * 自定义sql测试
     * @return 所有数据
     */
    @GetMapping(value = "/all")
    public List<Test> testMyMethod(){
        return testService.selectAll();
    }

    /**
     * mybatis plus sql测试
     * @param id 主键 id
     * @return 是否删除成功
     */
    @GetMapping(value = "/{id}")
    public boolean selectById(@PathVariable int id){
        return testService.deleteById(id);
    }
}
