package CH6.Method;

import java.util.Scanner;

public class Calculator {

    Scanner in = new Scanner(System.in);

    int plus (int x, int y) {
        int result = x + y;
        return result;
    }

    double avg (int x, int y) {
        double sum = plus(x, y);
        double result = sum / 2;
        return result;
    }

    void execute() {
        System.out.print("첫번째 숫자: ");
        int x = in.nextInt();
        System.out.print("두번째 숫자: ");
        int y = in.nextInt();
        double result = avg(x, y);
        println("실행결과: " + result);
    }

    void println(String str) {
        System.out.println(str);
    }
}
