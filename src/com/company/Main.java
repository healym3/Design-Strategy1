package com.company;

import com.company.controller.Scoreboard;
import com.company.model.Balloon;
import com.company.model.Clown;
import com.company.model.SquareBalloon;

public class Main {

    public static void main(String[] args) {
        Scoreboard scoreboard = new Scoreboard();
        System.out.println("Balloon Tap Score:");
        scoreboard.scoreAlgorithmBase = new Balloon();
        scoreboard.showScore(10,5);

        System.out.println("Clown Tap Score:");
        scoreboard.scoreAlgorithmBase = new Clown();
        scoreboard.showScore(10,5);

        System.out.println("Square Balloon Tap Score:");
        scoreboard.scoreAlgorithmBase = new SquareBalloon();
        scoreboard.showScore(10,5);
    }
}
