package quiz;

import java.util.Objects;

public abstract class Question {
    private String prompt;
    private String answer;
    private Double points;

    public Question(String prompt, String answer, Double points) {
        this.prompt = prompt;
        this.answer = answer;
        this.points = points;
    }

    public Question(String prompt, String answer){
        this(prompt, answer, 1.0);
    }

    public abstract Double grade();

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
