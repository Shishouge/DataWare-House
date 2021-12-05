package com.example.backend1.controller.neo4j;

import com.example.backend1.entity.neo4j.Actor;
import com.example.backend1.entity.neo4j.CoopDetail;
import com.example.backend1.entity.neo4j.Coopration;
import com.example.backend1.mapper.neo4j.Neo4jMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

@CrossOrigin
public class neo4jController {
    @Autowired(required = false)
    Neo4jMapper neo4jMapper;

    @RequestMapping(value = "/getTopCoopAA", method = RequestMethod.GET)
    public List<CoopDetail> getTopCoopAA() {
        List<Coopration> TopCoopAAs= neo4jMapper.getTopCoopAA();
        List<CoopDetail> result=new ArrayList<>();
        List<Coopration> TopCoopAAs1=new ArrayList<>();
        for(int i=0;i< TopCoopAAs.size();i++){

            String totalName=TopCoopAAs.get(i).getName();
            String name1=totalName.substring(0,totalName.indexOf("+"));
            String name2=totalName.substring(name1.length()+1,totalName.length());
            CoopDetail detail=new CoopDetail(name1,name2,TopCoopAAs.get(i).getCount());
            boolean flag=true;
            for(int j=0;j< result.size();j++)
            {
                if(result.get(j).getName1().equals(name2)||result.get(j).getName2().equals(name1))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
                result.add(detail);
        }
        return result;
    }

    @RequestMapping(value = "/getTopCoopAD",method = RequestMethod.GET)
    public List<CoopDetail> getTopCoopAD() {
        List<Coopration> TopCoopADs= neo4jMapper.getTopCoopAD();
        List<CoopDetail> result=new ArrayList<>();
        for(Coopration c:TopCoopADs){
            String totalName=c.getName();
            String name1=totalName.substring(0,totalName.indexOf("+"));
            String name2=totalName.substring(name1.length()+1,totalName.length());
            CoopDetail detail=new CoopDetail(name1,name2,c.getCount());
            boolean flag=true;
            for(int j=0;j< result.size();j++)
            {
                if(result.get(j).getName1().equals(name2)||result.get(j).getName2().equals(name1))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
                result.add(detail);
        }
        return result;
    }

    @RequestMapping(value = "/getTopCoopAW",method = RequestMethod.GET)
    public List<CoopDetail> getTopCoopAW() {
        List<Coopration> TopCoopAWs= neo4jMapper.getTopCoopAW();
        List<CoopDetail> result=new ArrayList<>();
        for(Coopration c:TopCoopAWs){
            String totalName=c.getName();
            String name1=totalName.substring(0,totalName.indexOf("+"));
            String name2=totalName.substring(name1.length()+1,totalName.length());
            CoopDetail detail=new CoopDetail(name1,name2,c.getCount());
            boolean flag=true;
            for(int j=0;j< result.size();j++)
            {
                if(result.get(j).getName1().equals(name2)||result.get(j).getName2().equals(name1))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
                result.add(detail);
        }
        return result;
    }

    @RequestMapping(value = "/getTopCoopAAByName",method = RequestMethod.GET)
    public List<CoopDetail> getTopCoopAAByName(String name) {
        name="\"Liam Neeson\"";
        List<Coopration> TopCoopAAs= neo4jMapper.getCoopAA(name);
        List<CoopDetail> result=new ArrayList<>();
        for(Coopration c:TopCoopAAs){
            String totalName=c.getName();
            String name1=totalName.substring(0,totalName.indexOf("+"));
            String name2=totalName.substring(name1.length()+1,totalName.length());
            CoopDetail detail=new CoopDetail(name1,name2,c.getCount());
            result.add(detail);
        }
        return result;
    }

    @RequestMapping(value = "/getTopCoopADByName",method = RequestMethod.GET)
    public List<CoopDetail> getTopCoopADByName(String name) {
        name="\"Liam Neeson\"";
        List<Coopration> TopCoopADs= neo4jMapper.getCoopAD(name);
        List<CoopDetail> result=new ArrayList<>();
        for(Coopration c:TopCoopADs){
            String totalName=c.getName();
            String name1=totalName.substring(0,totalName.indexOf("+"));
            String name2=totalName.substring(name1.length()+1,totalName.length());
            CoopDetail detail=new CoopDetail(name1,name2,c.getCount());
            result.add(detail);
        }
        return result;
    }

    @RequestMapping(value = "/getTopCoopAWByName",method = RequestMethod.GET)
    public List<CoopDetail> getTopCoopAWByName(String name) {
        name="\"Liam Neeson\"";
        List<Coopration> TopCoopAWs= neo4jMapper.getCoopAW(name);
        List<CoopDetail> result=new ArrayList<>();
        for(Coopration c:TopCoopAWs){
            String totalName=c.getName();
            String name1=totalName.substring(0,totalName.indexOf("+"));
            String name2=totalName.substring(name1.length()+1,totalName.length());
            CoopDetail detail=new CoopDetail(name1,name2,c.getCount());
            result.add(detail);
        }
        return result;
    }
}
