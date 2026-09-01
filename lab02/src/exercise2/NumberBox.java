package exercise2;

import java.util.List;

public class NumberBox<T extends Number> {

    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public double add(T otherNumber) {
        return item.doubleValue() + otherNumber.doubleValue();
    }

    public double sumNumbers(List<T> numbers) {
        double sum = 0.0;

        for (T number : numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }
}