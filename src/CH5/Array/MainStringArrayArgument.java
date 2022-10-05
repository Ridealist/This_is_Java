package CH5.Array;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("프로그램 사용법");
            System.out.println("Java MainStringArrayArgument should receive two arguments");
            System.exit(0);
        }

        String str1 = args[0];
        String str2 = args[1];

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }
}
