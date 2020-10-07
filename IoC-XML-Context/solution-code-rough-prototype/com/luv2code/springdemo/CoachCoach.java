package com.luv2code.springdemo;

public class CoachCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Coach";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
