package com.floreo.bbah;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Game game = new Game();

        int userScore = 0;

        int cpuScore = 0;
        int gameCount = 0;


        while(gameCount < 3){
            int outcome = game.startGame();
            if(outcome == 1){
                userScore++;
            } else{
                cpuScore++;
            }
            gameCount ++;
             if(gameCount == 3){
                if(userScore > cpuScore){
                    System.out.println("You have won the game!");
                } else {
                    System.out.println("Robots rule the world!");
                }
             }

        }

    }



}
