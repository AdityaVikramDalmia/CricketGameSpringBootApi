package com.springboot.mysqlconnector.controller;


import com.springboot.mysqlconnector.model.BallData;
import com.springboot.mysqlconnector.repo.BallJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scorecard")
public class ScoreBoardController {

    @Autowired
    private BallJpaRepo ballJpaRepo;

    @GetMapping(value="currscore")
    public BallData getScorecard(){
        return ballJpaRepo.findTopByOrderByIdDesc();

    }



}
