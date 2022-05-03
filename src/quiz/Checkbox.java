package quiz;

import java.util.ArrayList;

public class Checkbox extends Question{

    public Checkbox(String prompt, String answer, ArrayList<String> options, Double points) {
        super(prompt, answer, options, points);
    }

    public Checkbox(String prompt, String answer, ArrayList<String> options) {
        super(prompt, answer, options);
    }

    @Override
    public Double grade(String response) throws Exception {
        int answerBits = 0;
        int responseBits = 0;

        for (char c : getAnswer().toCharArray()) {
            answerBits *= 2;
            answerBits += c == '1' ? 0 : 1;
        }
        for (char c : response.toCharArray()) {
            if (c != '0' && c != '1') {
                throw new Exception("invalid response");
            }
            responseBits *= 2;
            responseBits += c == '1' ? 0 : 1;
        }

        //TODO: finish binary arithmetic

        return null;
    }
}
