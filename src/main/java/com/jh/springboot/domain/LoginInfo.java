package com.jh.springboot.domain;

import lombok.Data;

import java.util.Date;

@Data
public class LoginInfo {
    private int login_id;
    private int site_id;
    private boolean login_success;
    private Date login_timestamp;
    private boolean login_data_success;
    private String login_bigo;
}
