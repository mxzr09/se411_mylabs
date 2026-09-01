package exercise2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Test NumberBox with Integer
        NumberBox<Integer> integerBox = new NumberBox<>();
        integerBox.setItem(10);

        List<Integer> integerNumbers =
                Arrays.asList(1, 2, 3, 4);

        System.out.println("Stored Integer: "
                + integerBox.getItem());

        System.out.println("10 + 5 = "
                + integerBox.add(5));

        System.out.println("Integer list sum: "
                + integerBox.sumNumbers(integerNumbers));


        // Test NumberBox with Double
        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.setItem(10.5);

        List<Double> doubleNumbers =
                Arrays.asList(1.5, 2.5, 3.0);

        System.out.println("Stored Double: "
                + doubleBox.getItem());

        System.out.println("10.5 + 2.5 = "
                + doubleBox.add(2.5));

        System.out.println("Double list sum: "
                + doubleBox.sumNumbers(doubleNumbers));
    }
}