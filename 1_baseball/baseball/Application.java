package baseball;

import java.util.Scanner;

public class Application {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Baseball game = new Baseball();
        StringBuffer print = new StringBuffer();
        int input;

        while(true) {
            System.out.print("숫자를 입력해주세요 : ");
            input = scanInt();
            checkFormat(input, 100, 999);

            // System.out.println("_타겟: "+game.getAnswer()); // for debug
            // System.out.println("입력 : "+input);

            game.input(input);
            int strike = game.getStrike();
            int ball = game.getBall();

            if (ball != 0 && strike != 3)
                print.append(ball+"볼 ");
            if (strike != 0)
                print.append(strike+"스트라이크");
            if (print.length() == 0)
                print.append("낫싱");

            System.out.println(print.toString());
            print.delete(0, print.length());

            if (strike != 3)
                continue;

            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            input = scanInt();
            checkFormat(input, 1, 2);
            if (input == 1) {
                game.regame();
                continue;
            }
            break;
        }
        scanner.close();
    }
    
    public static int scanInt() {
        try {
            return scanner.nextInt();    
        } catch (java.util.InputMismatchException e) {
            scanner.close();
            throw new IllegalArgumentException();
        }
    }

    public static void checkFormat(int input, int start, int end) {
        if (input < start || input > end) {
            scanner.close();
            throw new IllegalArgumentException();
        }
    }
}
