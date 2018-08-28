package com.jm.coding.service.impl;

import com.jm.coding.dao.TestMapper;
import com.jm.coding.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public String getCode(Integer billId) {
        return testMapper.getCode(billId);
    }
}
