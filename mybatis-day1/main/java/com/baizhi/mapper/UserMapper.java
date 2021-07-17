package com.baizhi.mapper;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> findAllUser();

    List<User> findUserByName(String username);

    User findUserById(int id);

    List<User> findUserByDim(String username);

    List<User> findUserByDim1(String username);

    void add(User user);

    List<User> findUserByIdAndName(int id,String username);
    /**
     * 参数中指定名称
     */
    List<User> findUserByIdAndName1(@Param(value = "id") int id, @Param("username") String username);
    /**
     * 通过实体传递参数
     */
    List<User> findUserByIdAndName2(User user);

}
