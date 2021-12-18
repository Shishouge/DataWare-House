package com.example.backend1.controller.mysql2;

import com.example.backend1.entity.mysql.*;
import com.example.backend1.mapper.mysql2.MysqlMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class mysqlController2 {
    @Autowired
    MysqlMapper2 mysqlMapper;


    //Search for movies by the year released
    @RequestMapping(value = "/getMoviesByYearFromD2", method = RequestMethod.GET)
    @ResponseBody
    public Helper getMoviesByYear(String year){
        year="2014";
        long startTime = System.nanoTime();
        List<MovieDetail> movieDetails =mysqlMapper.getMoviesByYear(year);
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        Helper helper = new Helper(movieDetails,millsecs);
        return helper;
    }

    //Search for the num of movies released by a certain year
    @RequestMapping(value = "/getMoviesNumByYearFromD2", method = RequestMethod.GET)
    @ResponseBody
    public Helper getMoviesNumByYear(String year){
        year="2014";
        long startTime = System.nanoTime();
        List<MovieDetail> movieDetails =mysqlMapper.getMoviesByYear(year);
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(movieDetails.size(),millsecs);
    }

    //Search for movies by a certain month of a certain year
    @RequestMapping(value = "/getMoviesByYMFromD2", method = RequestMethod.GET)
    @ResponseBody
    public Helper getMoviesByYM(String year, String month){
        year="2014";
        month="3";
        long startTime = System.nanoTime();
        List<MovieDetail> movieDetails =mysqlMapper.getMoviesByYM(year,month);
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(movieDetails,millsecs);
    }

    //Search for the num of movies released in a certain month of a certain year
    @RequestMapping(value = "/getMoviesNumByYMFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getMoviesNumByYM(String year,String month){
        year="2014";
        month="3";
        long startTime = System.nanoTime();
        List<MovieDetail> movieDetails =mysqlMapper.getMoviesByYM(year,month);
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(movieDetails.size(),millsecs);
    }

    //Search for movies by a certain quarter in a certain year
    @RequestMapping(value = "/getMoviesByYQFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getMoviesByYQ(String year, String quarter){
        year="2014";
        quarter="1";
        long startTime = System.nanoTime();
        List<MovieDetail> movieDetails = mysqlMapper.getMoviesByYQ(year, quarter);
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(movieDetails,millsecs);
    }

    //Search movies by the first few words of title
    @RequestMapping(value = "/getMoviesByTitleFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getMoviesByTitle(String title){
        title="Harry Potter";
        long startTime = System.nanoTime();
        List<MovieDetail> movieDetailList =mysqlMapper.getMoviesByTitle(title);
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(movieDetailList,millsecs);
    }

    //Search for movie by full title
    @RequestMapping(value = "/getMovieByTitleFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getMovieByTitle(String title){
        title="Harry Potter";
        long startTime = System.nanoTime();
        List<MovieDetail> movieDetailList =mysqlMapper.getMovieByTitle(title);
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(movieDetailList,millsecs);
    }

    @RequestMapping(value = "/getMoviesByDirectorFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getMoviesByDirector(String name){
        name = "John huston";
        long startTime = System.nanoTime();
        List<MovieDetail> movieDetails = mysqlMapper.getMoviesByDirector(name);
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(movieDetails,millsecs);
    }

    @RequestMapping(value = "/getMoviesByWriterFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getMoviesByWriter(String name){
        name = "Ethan Coen";
        long startTime = System.nanoTime();
        List<MovieDetail> movieDetails = mysqlMapper.getMoviesByWriter(name);
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(movieDetails,millsecs);
    }

    @RequestMapping(value = "/getMoviesByActorFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getMoviesByActor(String name){
        name = "Oliver Hardy";
        long startTime = System.nanoTime();
        List<MovieDetail> movieDetails = mysqlMapper.getMoviesByActor(name);
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(movieDetails,millsecs);
    }

    @RequestMapping(value = "/getMoviesLeadingByActorFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getMoviesLeadingByActor(String name){
        name = "Morgan Freeman";
        long startTime = System.nanoTime();
        List<MovieDetail> movieDetails = mysqlMapper.getMoviesLeadingByActor(name);
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(movieDetails,millsecs);
    }

    //Search for the top 20 groups of actors and actresses that worked together the most
    @RequestMapping(value = "/getCoopAATopFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getCoopAATop(){
        long startTime = System.nanoTime();
        List<CoopAA> coopAAList = mysqlMapper.getCoopAATop();
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(coopAAList,millsecs);
    }

    @RequestMapping(value = "/getCoopADTopFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getCoopADTop(){
        long startTime = System.nanoTime();
        List<CoopAD> coopADList = mysqlMapper.getCoopADTop();
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(coopADList,millsecs);
    }

    @RequestMapping(value = "/getCoopAWTopFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getCoopAWTop(){
        long startTime = System.nanoTime();
        List<CoopAW> coopAWList = mysqlMapper.getCoopAWTop();
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(coopAWList,millsecs);
    }

    @RequestMapping(value = "/getCoopDWTopFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getCoopDWTop(){
        long startTime = System.nanoTime();
        List<CoopDW> coopDWList = mysqlMapper.getCoopDWTop();
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(coopDWList,millsecs);
    }

    @RequestMapping(value = "/getCoopADByActorFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getCoopADByActor(String actor){
        actor = "Todd Haberkorn";
        long startTime = System.nanoTime();
        List<CoopAD> coopADList = mysqlMapper.getCoopADByActor(actor);
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(coopADList,millsecs);
    }

    @RequestMapping(value = "/getCoopAAByActorFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getCoopAAByActor(String actor){
        actor = "Todd Haberkorn";
        long startTime = System.nanoTime();
        List<CoopAA> coopAAList = mysqlMapper.getCoopAAByActor(actor);
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(coopAAList,millsecs);
    }

    @RequestMapping(value = "/getMoviesByGenresFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getMoviesByGenres(String genres){
        genres = "Action";
        long startTime = System.nanoTime();
        List<MovieDetail> movieDetails = mysqlMapper.getMoviesByGenres(genres);
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(movieDetails,millsecs);
    }

    @RequestMapping(value = "/getGenresRankingFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getGenresRanking(){
        long startTime = System.nanoTime();
        List<Genres> genresList = mysqlMapper.getGenresRanking();
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(genresList,millsecs);
    }

    @RequestMapping(value = "/getMoviesByScoreFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getMoviesByScore(Integer score){
        score = 4;
        long startTime = System.nanoTime();
        List<MovieScore> movies = mysqlMapper.getMoviesByScore(score);
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(movies,millsecs);
    }

    @RequestMapping(value = "/getMoviesByReviewNumFromD2",method = RequestMethod.GET)
    @ResponseBody
    public Helper getMoviesByReviewNum(){
        long startTime = System.nanoTime();
        List<MovieReview> moives = mysqlMapper.getMoviesByReviewNum();
        double millsecs = (System.nanoTime() - startTime) / 1000000.0;
        return new Helper(moives,millsecs);
    }

}
