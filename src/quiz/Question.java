package quiz;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Question {
    private String prompt;
    private String answer;
    private Double points;
    private ArrayList<String> options;


    public Question(String prompt, String answer,ArrayList<String> options,Double points) {
        this.prompt = prompt;
        this.answer = answer;
        this.points = points;
        this.options = options;
    }

    public Question(String prompt, String answer,ArrayList<String> options){
        this(prompt, answer,options, 1.0);
    }

    public abstract Double grade(String response) throws Exception;

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public String getAnswer() {
        return answer;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question question = (Question) o;
        return prompt.equals(question.prompt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prompt);
    }
}
