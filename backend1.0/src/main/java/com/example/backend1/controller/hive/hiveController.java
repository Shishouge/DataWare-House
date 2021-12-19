package com.example.backend1.controller.hive;

import com.example.backend1.entity.hive.actor;
import com.example.backend1.mapper.hive.HiveMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class hiveController {
    @Autowired
    HiveMapper hiveMapper;

    @ApiOperation("")
    @RequestMapping(value = "/getHiveActors",method = RequestMethod.GET)
    public List<actor> getAllActors()
    {
        return hiveMapper.getAllActors();
    }


}
