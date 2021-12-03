package com.example.backend1.controller.mysql;

import com.example.backend1.entity.mysql.User;
import com.example.backend1.mapper.mysql.MysqlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class mysqlController {
    @Autowired
    MysqlMapper mysqlMapper;
    @RequestMapping(value = "/getSingleInformation",method = RequestMethod.GET)
    @ResponseBody
    public User getSingleInformation(String email)
    {
        email="2577672771@qq.com";
        User user=mysqlMapper.getByUserEmail(email);
        return user;
    }
}
