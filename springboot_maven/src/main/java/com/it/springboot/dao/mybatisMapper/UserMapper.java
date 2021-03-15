package com.it.springboot.dao.mybatisMapper;

import com.it.springboot.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    /*mybatis注解形式的配置*/
    @Select({"select * from user where user_name =#{username}"})
    @Results(id = "resultMap", value = {@Result(property = "id", column = "id"),
            @Result(property = "username", column = "user_name"),
            @Result(property = "age", column = "user_age"),
            @Result(property = "createTime", column = "create_Time")})
    public List<User> selectUserByName(String username);
}
