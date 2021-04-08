package learn.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Array
 */
public class App {
    static Scanner scanner = new Scanner(System.in);

    private static int[] getIntegers(int nextInt) {
        int[] newArray = new int[nextInt];
        System.out.println("Enter " + nextInt + " values of integer");
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    private static void printArray(int[] printArray) {
        System.out.print("Printing the given array: ");
        for (int i : printArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void sortArray(int[] sortArray) {
        int[] newArray = sortArray.clone();
        Arrays.sort(newArray);
        System.out.println("Sorted Array: " + Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        System.out.println("Give the size of basicArray: ");
        int[] basicArray = getIntegers(scanner.nextInt());
        printArray(basicArray);
        sortArray(basicArray);
    }
}
