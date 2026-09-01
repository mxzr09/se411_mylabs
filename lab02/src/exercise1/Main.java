package exercise1;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Mohammed", "Faisal", "Hamad"};

        PrintableList<String> printableNames =
                new PrintableList<>(names);

        printableNames.printItems();
    }
}