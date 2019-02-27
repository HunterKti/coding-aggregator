package com.jm.coding;

import lombok.Data;

import java.util.List;

@Data
public class Col {

    private Object id;
    private String title;
    private String description;
    private String by;
    private List<String> tags;
    private Integer likes;
}
