package com.company.controller;

public class Scoreboard {
    public ScoreAlgorithmBase scoreAlgorithmBase;

    public void showScore(int taps, int multiplier){
        System.out.println(scoreAlgorithmBase.calculateScore(taps, multiplier));
    }
}
