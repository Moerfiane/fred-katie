package org.launchcode.java.studios.quizzes;

public abstract class Question {
    public String questionText;
    public String answerText;
    public int pointScore = 1;

    public Question(String questionText){
        this.questionText = questionText;
    }

    public Question(String questionText, int pointScore) {
        this.questionText = questionText;
        this.pointScore = pointScore;
    }

    public int getPointScore(){
        return pointScore;
    }

    public abstract int askQuestion();


}
