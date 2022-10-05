package CH5;

public class ArrayCopy {
    public static void main(String[] args) {
        String[] oldStrArray = { "Java", "Python", "JavaScript" };
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i=0; i<newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
