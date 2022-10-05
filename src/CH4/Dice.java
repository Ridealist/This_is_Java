package CH4;

public class Dice {
    public static void main(String[] args) {

        double m = Math.random();

        int n = (int)(m * 6) + 1;

        System.out.println(n);
    }

}
