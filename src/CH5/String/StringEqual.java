package CH5.String;

public class StringEqual {
    public static void main(String[] args) {
        String val1 = "Java";
        String val2 = "Java";

        if (val1 == val2) {
            System.out.println("val1과 val2는 참조가 같음!");
        }
        else {
            System.out.println("val1과 val2는 참조가 다름...");
        }

        if (val1.equals(val2)) {
            System.out.println("val1과 val2는 문자열이 같음!");
        }

        String val3 = new String("Java");
        String val4 = new String("Java");

        if (val3 == val4) {
            System.out.println("val3와 val4는 참조가 같음!");
        }
        else {
            System.out.println("val3와 val4는 참조가 다름...");
        }

        if (val3.equals(val4)) {
            System.out.println("val3와 val4는 문자열이 같음!");
        }
    }
}
