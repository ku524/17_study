package baseball;

import utils.RandomUtils;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Baseball {
    private int answer = RandomUtils.nextInt(100, 999);
    private String[] answerNum = Stream.of(String.valueOf(answer).split("")).toArray(String[]::new);
    private int strike;
    private int ball;

    void regame() {
        answer = RandomUtils.nextInt(100, 999);
        answerNum = Stream.of(String.valueOf(answer).split("")).toArray(String[]::new);
    }

    void input(int input) {
        String[] inputNum = Stream.of(String.valueOf(input).split("")).toArray(String[]::new);

        strike = (int)IntStream
                        .range(0, inputNum.length)
                        .filter(index -> inputNum[index].equals(answerNum[index]))
                        .count();

        ArrayList<String> answerNumList = new ArrayList<String>(Arrays.asList(answerNum));

        ball = (int)Stream.of(String.valueOf(input).split(""))
                                    .filter(element -> answerNumList.remove(element))
                                    .count();
    }

    int getStrike() {
        return strike;
    }

    int getBall() {
        return ball;
    }

    int getAnswer() {
        return answer;
    }
}
