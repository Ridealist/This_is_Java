import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean run = true;

        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("__________________________________");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("__________________________________");
            System.out.print("선택> ");

            String inputString = scanner.nextLine();

            if (inputString.equals("1")) {
                System.out.print("예금액> ");

                String input = scanner.nextLine();

                int money = Integer.parseInt(input);
                balance += money;
            }
            if (inputString.equals("2")) {
                System.out.print("출금액> ");

                String input = scanner.nextLine();

                int money = Integer.parseInt(input);

                if (money > balance) {
                    System.out.println("잔고보다 많은 금액을 출금할 수 없습니다.");
                    continue;
                }
                balance -= money;
            }
            if (inputString.equals("3")) {
                System.out.println("잔고> " + balance);
            }
            if (inputString.equals("4")) {
                break;
            }
        }

        System.out.println("프로그램 종료");
    }
}
