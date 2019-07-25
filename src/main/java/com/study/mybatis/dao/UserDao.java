package com.study.mybatis.dao;


import com.study.mybatis.entity.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

    public User selectOneUser(Integer userId);
    @MapKey("userName")
    public Map<String,Object> seletMap(String userName);
    public List<User> selectAll();

    void  addUser(User user);
    void  updateUser(User user);
    void  deleteUser(Integer id);
    /*动态sql*/

    List<User>  getUserByCondition(User  user);




}
