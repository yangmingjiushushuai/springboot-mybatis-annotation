package com.mingyang.it.springbootmybatisannotation.mappers;

import com.mingyang.it.springbootmybatisannotation.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

    //查询所以的用户
    @Select("select * from user")
    List<User> getAllUsers();

    //删除用户
    @Delete("delete from user where id = #{id}")
    void delete(Integer id);
}
