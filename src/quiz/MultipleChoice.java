package quiz;

import java.util.ArrayList;

public class MultipleChoice extends Question {


    public MultipleChoice(String prompt, String answer, ArrayList<String> options, Double points) {
        super(prompt, answer, options, points);
    }

    public MultipleChoice(String prompt, String answer, ArrayList<String> options) {
        super(prompt, answer, options);
    }

    @Override
    public Double grade(String response) {
        if (response.equals(getAnswer())) {
            return getPoints();
        } else {

            return 0.0;
        }
    }
}
