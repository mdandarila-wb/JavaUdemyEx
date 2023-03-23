import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Marian");

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an Alien");
        } else {
            System.out.println("It is ET");
        }

        int topScore = 80;
        if (topScore == 100) {
            System.out.println(" You got the highest score! ");
        }

        int secondScore = 90;
        if (topScore > secondScore && secondScore < 100) {
            System.out.println("whaaat ?");
        }
        if ((topScore > 90) || (secondScore == 90)) System.out.println("One of the conditions is true");

        int age = 13;
        String isMajor = (age >= 18) ? "is Major": "isMinor";
        System.out.println(isMajor);
    }
}
