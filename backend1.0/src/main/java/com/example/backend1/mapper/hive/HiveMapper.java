package com.example.backend1.mapper.hive;

import com.example.backend1.entity.hive.actor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HiveMapper {
    List<actor> getAllActors();
}
