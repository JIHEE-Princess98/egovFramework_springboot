package com.jh.springboot.user.service;

import com.jh.springboot.domain.Token;
import com.jh.springboot.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Map;

public interface UserService extends UserDetailsService {
    String validRefreshToken(String user_id);
    int updateRefreshToken(Token token);
    User getUserForLogin(User user);
    User getUser(String id);
    void insertUser(User user);

    List<Map<String, Object>> selectAllUser();

    List<Map<String, Object>> selectByIdUser(String id);
}
