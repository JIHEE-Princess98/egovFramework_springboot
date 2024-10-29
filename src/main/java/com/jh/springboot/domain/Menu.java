package com.jh.springboot.domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public class Menu {
    private String ptId;
    private String type;
    private String text;
    private String url;
    private String icon;
    private List<Menu> children;
}
