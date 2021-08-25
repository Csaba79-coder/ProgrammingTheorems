import Theorems.ProgrammingTheorems;

import java.util.Arrays;

public class StartingProgrammingTheorems {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("The sum of the array elements are: " + ProgrammingTheorems.sum(array));
        System.out.println("The sum of the array elements are: " + ProgrammingTheorems.sum2(array));
        System.out.println(ProgrammingTheorems.count(array) + " elements has the array!");
        int number1 = 6;
        System.out.println("The array contains " + number1 + ": " + ProgrammingTheorems.decision(array, number1));
        int number2 = 7;
        System.out.println("The array contains " + number2 + ": " + ProgrammingTheorems.decision(array, number2));
        System.out.println("The array contains " + number1 + ": " + ProgrammingTheorems.decision2(array, number1));
        System.out.println("The array contains " + number2 + ": " + ProgrammingTheorems.decision2(array, number2));
        System.out.println("The array's index where the " + number1 + " is situated is: " + ProgrammingTheorems.index(array, number1));
        int[] array1 = {1, 2, 3, 4, 5, 6, 1, 2, 1, 2};
        System.out.println(Arrays.toString(ProgrammingTheorems.sorting(array1, 2)));
        System.out.println(Arrays.toString(ProgrammingTheorems.copyOfSorting(array1, 2)));
        int[] array2 = {1, 2, 3, 4, 5, 6, 1, 2, 1, 2};
        System.out.println(Arrays.toString(ProgrammingTheorems.assortment(array2, 2)));
        int[] array3 = {1, 2, 3, 4, 5, 6};
        int[] array4 = {3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(ProgrammingTheorems.intersection(array3, array4)));
        System.out.println(Arrays.toString(ProgrammingTheorems.union(array3, array4)));
        System.out.println(ProgrammingTheorems.max(array4));
        System.out.println(ProgrammingTheorems.min(array4));

        System.out.println("Sorting with finding max value:");
        int[] sortingMax1 = {1, 10, 100, 9, 7, 52, 99, 78, 34, 77};
        System.out.println(Arrays.toString(ProgrammingTheorems.sortingWithChoosingMaxIncreasingValues(sortingMax1)));
        System.out.println("Sorting with finding min value:");
        int[] sortingMin1 = {1, 10, 100, 9, 7, 52, 99, 78, 34, 77};
        System.out.println(Arrays.toString(ProgrammingTheorems.sortingWithChoosingMinIncreasingValues(sortingMin1)));
        System.out.println("Bubble sort increasing and decreasing:");
        int[] bubble1 = {1, 10, 100, 9, 7, 52, 99, 78, 34, 77};
        System.out.println(Arrays.toString(ProgrammingTheorems.bubbleSortGrowing(bubble1)));
        int[] bubble2 = {1, 10, 100, 9, 7, 52, 99, 78, 34, 77};
        System.out.println(Arrays.toString(ProgrammingTheorems.bubbleSortGrowing2(bubble2)));
        int[] bubble5 = {1, 10, 100, 9, 7, 52, 99, 78, 34, 77};
        System.out.println(Arrays.toString(ProgrammingTheorems.bubbleSortIncreasing1(bubble5)));
        int[] bubble3 = {1, 10, 100, 9, 7, 52, 99, 78, 34, 77};
        System.out.println(Arrays.toString(ProgrammingTheorems.bubbleSortReducing(bubble3)));
        int[] bubble4 = {1, 10, 100, 9, 7, 52, 99, 78, 34, 77};
        System.out.println(Arrays.toString(ProgrammingTheorems.bubbleSortReducing2(bubble4)));
        System.out.println("Binary search (using any of the sorted arrays!!!)");
        System.out.println("The index of the number is: ");
        int[] binary = {1, 7, 9, 10, 34, 52, 77, 78, 99, 100};
        System.out.println(ProgrammingTheorems.binarySearch(binary, 9));
        System.out.println(ProgrammingTheorems.binarySearch(binary, 78));
    }
}
