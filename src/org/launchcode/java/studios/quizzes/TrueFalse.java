package org.launchcode.java.studios.quizzes;

import java.util.Scanner;

public class TrueFalse extends Question {
    public String userAnswer;
    public String correctAnswer;

    public TrueFalse(String questionText, boolean answer) {
        super(questionText)
    }


    public int correctAnswer() {
        Scanner input = new Scanner(System.in);
        userAnswer = input.nextLine();
        if (userAnswer == correctAnswer) {
            numberCorrectAnswers++;
        }
        return numberCorrectAnswers;
    }
}





