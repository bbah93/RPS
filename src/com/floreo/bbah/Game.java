package com.floreo.bbah;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public int startGame(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock Paper Scissors, the classic command line game!");
        System.out.println("################");
        System.out.println("Pick a number to the corresponding choice");
        System.out.println("Rock = 1 \n" +
                "Paper = 2 \n" +
                "Scissors = 3");

        int userResponse = scanner.nextInt();
        int cpuResponse = getCPUResponse();
        int score = 0;

        switch(userResponse){
            case 1: Rock rock = new Rock(cpuResponse);
                score = rock.checkOutcome();
                break;
            case 2: Paper paper = new Paper(cpuResponse);
                score = paper.checkOutcome();
                break;
            case 3: Scissors scissors = new Scissors(cpuResponse);
                score = scissors.checkOutcome();
                break;
            default:
                System.out.println("Invalid user response");
        }

        if(score > 0){
            System.out.println("User wins this round!");
        } else {
            System.out.println("You have lost this round :(");
        }
        return score;

    }

    public int getCPUResponse(){
        Random rand = new Random();

        // Generate random integers in range 1 to 3
        int rand_int = rand.nextInt(3) + 1;
        System.out.println(rand_int);

        return rand_int;
    }
}
