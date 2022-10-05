package CH5.Exercises;

public class FindMax {
    public static void main(String[] args) {
        int max = 0;
        int[] array = { 1, 5, 3, 2, 6 };

        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("max: " + max);
    }
}
