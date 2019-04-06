package com.example.demo.test.web;


import com.example.demo.test.entity.JcYxb;
import com.example.demo.test.service.JcYxbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 基础_院系表 前端控制器
 * </p>
 *
 * @author wangyaodong
 * @since 2019-04-06
 */
@RestController
@RequestMapping("/test/jc-yxb")
public class JcYxbController {

    @Autowired
    private JcYxbService jcYxbService;

    @GetMapping(value = "/test")
    public JcYxb test() {
        return jcYxbService.selectById(1003);
    }

    @GetMapping(value = "/test1")
    public List<JcYxb> test1() {
        return jcYxbService.selectList(null);
    }
}
