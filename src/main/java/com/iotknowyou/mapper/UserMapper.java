package com.iotknowyou.mapper;

import com.iotknowyou.model.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.codehaus.jackson.annotate.JsonTypeInfo;

import javax.annotation.Resource;
import java.util.List;

/**
 * @title: UserMapper
 * @projectName ssm-demo
 * @author: RongHua Liu
 * @date: 2019/11/21  12:54
 * @description: UserMapper
 */

@Resource
public interface UserMapper {

   @Select("select * from user limit 1 ")
    User getInfo();

    //一对多
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="username",property="username"),
            @Result(column="password",property="password"),
    })
   @Select("select * from user ")
   List<User> getAllInfo();
}
