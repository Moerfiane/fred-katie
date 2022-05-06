package org.launchcode.java.studios.quizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private ArrayList<String> answers;
    public int correctAnswer;
    Scanner input = new Scanner(System.in);
    private String responsePrompt = "Enter number for your answer eg. 1, 2 , 3, 4";

    public MultipleChoice(String questionText, ArrayList<String> answers){
        super(questionText);
            this.answers = answers;
    }

    public MultipleChoice(String questionText){
        super(questionText);
    }

    public String getResponsePrompt(){
        return responsePrompt;
    }






}
