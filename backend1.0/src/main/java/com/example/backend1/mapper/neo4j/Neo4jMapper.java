package com.example.backend1.mapper.neo4j;

import com.example.backend1.entity.neo4j.Actor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Neo4jMapper {
    List<Actor> getActor();
}
