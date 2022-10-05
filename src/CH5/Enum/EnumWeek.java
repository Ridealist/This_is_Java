package CH5.Enum;

import java.util.Calendar;

public class EnumWeek {
    public static void main(String[] args) {
        Week today = null; // 열거 타입 변수 선언
        Week[] days = Week.values();

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK); // Sun(1) ~ Sat(7)까지의 숫자를 리턴

        today = days[week-1];
//        switch (week) {
//            case 1:
//                today = Week.SUNDAY; break;
//            case 2:
//                today = Week.MONDAY; break;
//            case 4:
//                today = Week.WEDNESDAY; break;
//            // End so on...
//        }
        System.out.println("오늘 요일: " + today);

        if (today==Week.SUNDAY) {
            System.out.println("오늘은 쉬는 날 유후~!");
        }
        else {
            System.out.println("오늘은 Java 공부하는 날 하하하...");
        }
    }
}
