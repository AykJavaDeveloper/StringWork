package DataTime;

import java.time.LocalDateTime;

public class LocalDatetime {
    public static void main(String[] args) {
        StringBuilder numbers = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i =0; i < 10_000; i++) {
            numbers.append(i);
        }

        System.out.println(System.currentTimeMillis() - startTime);


        String name = "Aik";
        String nameOne = "Aik";

        String nameTwo = new String("Aik");
        String nameThree = new String("Aik");

        System.out.println(nameTwo.equals(nameThree));




    }
}
