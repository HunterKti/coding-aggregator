package com.jm.coding.controller;

import com.jm.coding.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private TestService testService;

    /**
     * 获取单号
     * @param billId
     * @return
     */
    @RequestMapping("/getCode/{billId}")
    public String hello(@PathVariable Integer billId){
        //return testService.getCode(billId);
        return "DSGC18080925";
    }
}
