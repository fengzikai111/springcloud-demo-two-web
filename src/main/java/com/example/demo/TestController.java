package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zwl on 2018/1/17.
 */
@RestController
public class TestController {
    @RequestMapping("/mictwoweb/test")
    public void test(){
        System.out.println("this test");

    }
}
