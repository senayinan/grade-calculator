package com.senayinan.practice;

import java.util.Scanner;

public class InputHandler {
    private Scanner input;

    public InputHandler(Scanner input) {
        this.input = input;
    }

    public double[] getScores(int numOfScores)   {
        double[] scores = new double[numOfScores];

        for (int i = 0; i < numOfScores; i++) {
            double score = 0;
            do {
            System.out.println("What is your " + getOrdinal(i + 1) + " score?: ");
            score = input.nextDouble();
            if (score > 100) {
                System.out.println("Invalid score! Please enter a score less than or equal to 100.");
                }
            }   while (score > 100) ;
            scores[i] = score;
        }
        return  scores;
    }

    public double calcAverageScore(double[] scores)   {
        double sum = 0;
        for(double score : scores) {
            sum += score;
        }
        return  sum/scores.length;

    }

    //to get ordinal numbers
    private String getOrdinal(int number) {
        if(number %100>=11 && number<=13)   {
            return number + "th";
        }
        switch(number %10)  {
            case 1: return number + "st";
            case 2: return number + "nd";
            case 3: return number + "rd";
            default: return number + "th";
        }

    }
}
