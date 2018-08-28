package com.jm.coding.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestMapper {

    @Select("select orderBillCode from svcOrderBill where orderBillId=#{billId}")
    String getCode(Integer billId);
}
