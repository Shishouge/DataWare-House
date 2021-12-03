package com.example.backend1.controller.neo4j;

import com.example.backend1.entity.neo4j.Actor;
import com.example.backend1.mapper.neo4j.Neo4jMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin
public class neo4jController {
    @Autowired(required = false)
    Neo4jMapper neo4jMapper;

    @RequestMapping(value = "/getActor", method = RequestMethod.GET)
    @ResponseBody
    public List<Actor> getActor() {
        List<Actor> actors=neo4jMapper.getActor();
        return actors;
    }
}
