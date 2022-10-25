package sorting.linearSorting;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();
        Integer[] array = new Integer[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(1000);
        }

        countingSort.sort(array);
    }
}
