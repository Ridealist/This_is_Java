public class NestedIf {
    public static void main(String[] args) {

            for (int i=2; i<=9; i++) {
                System.out.println("**** " + i + "단" + " ***");
                for (int j=1; j<=9; j++) {
                    System.out.println("구구단: " + i + "*" + j + " 는 " + i*j);
                }
        }

        // int score = (int)(Math.random() * 20) + 81;
//        int score = 81;
//
//        String grade;
//
//        if (score>=90) {
//            if (score>=95) {
//                grade = "A+";
//            }
//            else {
//                grade = "A";
//            }
//        }
//        else {
//            if (score>=85) {
//                grade = "B+";
//            }
//            else {
//                grade = "B";
//            }
//        }
//
//        System.out.println("점수는 " + score + "점 입니다.");
//        System.out.println("학점: " + grade);
    }

}
