package com.jh.springboot.domain;

import lombok.Data;

@Data
public class LogData {
    private String user_id;
    private String url;
    private String url_type;
    private int count;
}
