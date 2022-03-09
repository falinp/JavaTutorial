package CollectionJenerics;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSortDemo {
    public static int[] numbers = new int[]{56, 45, 89, 1, 45, 13, 4, 69, 11, -89};

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nОтсортированные числа в натуральном порядке:");
        print();
    } // main(String[]) method

    public static void sort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                } // if
            } // for(j)
        } // for(j)
    } // sort() method

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        } // for
    } // print() method
} // BubbleSortDemo class