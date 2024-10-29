package com.jh.springboot.user.mapper;

import com.jh.springboot.domain.Token;
import com.jh.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User getUserForLogin(User user);
    String validRefreshToken(String user_id);
    int updateRefreshToken(Token token);

    User getUser(String id);
    String getUserPw(String id);
    void insertUser(User user);

    List<User> selectAllUser();
    List<User> selectByIdUser(String id);
}
