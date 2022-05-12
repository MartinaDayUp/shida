package com.shida.cn.demo.dao;

import com.shida.cn.demo.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import java.util.List;

@Component("userMapper")
@Mapper
public interface UserDao {
    //增加
    @Insert("insert into user(username,password,email) values(#{username},#{password},#{email}) ")
    int addUser(User user);

    //删
    @Delete("delete from user where userId=#{userId}")
    int deleteById(int userId);

    //改
    @Update("update user set password=#{password} where username=#{username}")
    int update(User user);

    //查  查找所有用户
    @Select("select * from user")
    List<User> findAll();

    //根据用户名  查找用户
    @Select("select * from user where username=#{username}")
    User findByName(String username);
}
