package exercise1;

import java.util.Arrays;
import java.util.List;

public class PrintableList<T> {

    private List<T> items;

    public PrintableList(T[] itemArray) {
        this.items = Arrays.asList(itemArray);
    }

    public void printItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}