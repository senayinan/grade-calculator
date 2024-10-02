package com.senayinan.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);


		Scanner input = new Scanner(System.in);
		InputHandler inputHandler = new InputHandler(input);
		System.out.println("Please enter number of the scores: ");
		int numberOfScores = input.nextInt();
		double[] scores = inputHandler.getScores(numberOfScores);
		double avScore = inputHandler.calcAverageScore(scores);
		System.out.println("The average score is " + avScore);

		GradeCalculator gradeCalculator = new GradeCalculator();
		String avGrade = gradeCalculator.calculateGrade(avScore);
		System.out.println("Your grade is " + avGrade);
		input.close();
	}


}
