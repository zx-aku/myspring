package com.aku.dao;

import com.aku.domain.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from User where id=#{id}")
    User findUserById(Integer id);
}
