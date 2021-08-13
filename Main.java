package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the students KCSE score Points: ");
        double KCSE_score;
        KCSE_score = input.nextDouble();

        System.out.println("Enter the students Interview Score: ");
        int InterviewScore;
        InterviewScore = input.nextInt();
        System.out.println("------------");

        System.out.println("Enter the students confidence Score: ");
        int CofidenceScore;
        CofidenceScore = input.nextInt();
        System.out.println("-----------");

        if (KCSE_score >= 0 && KCSE_score <= 100.0 && InterviewScore >= 0 && InterviewScore <=
                10 && CofidenceScore >= 0 && CofidenceScore <= 10) {
            if (KCSE_score >= 65.0 && InterviewScore >= 6 && CofidenceScore >= 5) {
                System.out.println("Student is accepted into University!");
                System.out.println("Students KCSE scores are " + KCSE_score + " and students Interview score is "
                        + InterviewScore + "and students confidence score is" + CofidenceScore);
            } else {
                System.out.println("Student is not accepted into university!");
                System.out.println("Students KCSE scores are " + KCSE_score + " and students Interview score is "
                        + InterviewScore + "and students confidence score is" + CofidenceScore);
            }
        }
        else{
            System.out.println("thank you for your input");
        }
    }
}