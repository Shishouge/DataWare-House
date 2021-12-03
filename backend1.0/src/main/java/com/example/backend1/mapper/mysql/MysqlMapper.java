package com.example.backend1.mapper.mysql;

import com.example.backend1.entity.mysql.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MysqlMapper {
    //通过邮箱返回用户信息
    User getByUserEmail(String email);
}
