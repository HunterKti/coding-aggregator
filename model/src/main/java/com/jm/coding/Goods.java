package com.jm.coding;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Goods {
    private Integer id;
    private String goods_name;
    private String goods_title;
    private BigDecimal goods_price;
    private Integer goods_stock;
}
