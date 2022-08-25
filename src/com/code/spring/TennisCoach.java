package com.code.spring;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Autowired
    private FortuneService fortuneService;

    // @Autowired
    // public TennisCoach(FortuneService fortuneService) {
    // this.fortuneService = fortuneService;
    // }

    public TennisCoach() {
        System.out.println(">>>> inside default constructor");
    }

    @Override
    public String getDailyWorkout() {

        return "Practice your bcakhand volley";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }

}