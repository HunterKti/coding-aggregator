package com.jm.coding.controller;

import com.jm.coding.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private TestService testService;

    /**
     * 获取单号
     * @param
     * @return
     */
    @RequestMapping(value = "/hello")
    public String hello(){
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String IP=address.getHostAddress().toString();//本机地址
        return "IP:"+IP;
    }
}