package CH6.Static;

import java.awt.*;

public class Person {
    final String nation = "Republic of Korea";
    final String ssn;
    String name;

    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }

    public static void main(String[] args) {
        Person p1 = new Person("123456-9876543", "고준보");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        // p1.nation = "USA";
        p1.name = "김보준";
    }
}
