package exercise4;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void printList(List<?> items) {
        for (Object item : items) {
            System.out.println(item);
        }
    }

    public static double sumNumbers(
            List<? extends Number> numbers) {

        double sum = 0.0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Mohammed", "Faisal", "Hamad");

        List<Integer> integerNumbers =
                Arrays.asList(10, 20, 30);

        List<Double> doubleNumbers =
                Arrays.asList(1.5, 2.5, 3.0);

        System.out.println("String list:");
        printList(names);

        System.out.println("Integer list:");
        printList(integerNumbers);

        System.out.println("Integer sum: "
                + sumNumbers(integerNumbers));

        System.out.println("Double sum: "
                + sumNumbers(doubleNumbers));
    }
}