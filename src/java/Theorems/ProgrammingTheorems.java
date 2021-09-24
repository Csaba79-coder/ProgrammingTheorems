package Theorems;

public class ProgrammingTheorems {

    public static int sum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public static int sum2(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; ) {
            sum += array[i];
            i++;
        }
        return sum;
    }


    public static int count(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter++;
        }
        return counter;
    }


    public static boolean decision(int[] array, int number) {
        // boolean contains = false; // boolean contains = false; is the same expression, as boolean default value is false!
        for (int j : array) {
            if (j == number) {
                ++j;
                return true; // return !contains
            }
        }
        return false; // return false
    }


    public static boolean decision2(int[] array, int number) {
        for (int j : array) {
            if (j == number) {
                ++j;
                // contains = true;
                return true;
            }
        }
        return false;
    }


    public static int index(int[] array, int number) {
        int index;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                i++;
            }
        }
        index = (number - 1);
        return index;
    }


    public static int[] sorting(int[] array, int number) {
        int selectedId = 0;
        int counter = 0;
        for (int j : array) {
            if (j == number) {
                counter++;
            }
        }
        int[] selected = new int[counter];
        for (int j : array) {
            if (j == number) {
                selected[selectedId] = j;
                selectedId++;
            }
        }
        return selected;
    }


    public static int[] copyOfSorting(int[] array, int number) {
        int selectedId = 0;
        int counter = 0;
        for (int j : array) {
            if (j == number) {
                counter++;
            }
        }
        int[] selected = new int[counter];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                array[i]++;
                selected[selectedId] = array[i];
                selectedId++;
            }
        }
        return selected;
    }


    public static int[] assortment(int[] array, int number) {
        int selectedId = 0;
        int counter = 0;
        for (int j : array) {
            if (j == number) {
                counter++;
            }
        }
        int[] selected = new int[counter];
        for (int j : array) {
            if (j == number) {
                selected[selectedId] = j;
                selectedId++;
            }
        }
        int[] unselected = new int[array.length - counter];
        int nonId = 0;
        for (int k : array) {
            if (k != number) {
                unselected[nonId] = k;
                nonId++;
            }
        }
        return unselected;
    }


    public static int[] intersection(int[] array1, int[] array2) {
        int counter = 0;
        for (int k : array1) {
            for (int i : array2) {
                if (k == i) {
                    counter++;
                }
            }
        }
        int[] intersection = new int[counter];
        int id = 0;
        for (int j : array1) {
            for (int k : array2) {
                if (j == k) {
                    intersection[id] = k;
                    id++;
                }
            }
        }
        return intersection;
    }


    public static int[] union(int[] array1, int[] array2) {
        int id = 0;
        int[] union = new int[array1.length + array2.length];
        for (int j : array1) {
            union[id] = j;
            id++;
        }
        for (int i : array2) {
            union[id] = i;
            id++;
        }
        return union;
    }


    public static int max(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }


    public static int min(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }


    public static int[] sortingWithChoosingMaxIncreasingValues(int[] array) {

        int[] sortedWithMaxValue = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int tmp;
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.arraycopy(array, 0, sortedWithMaxValue, 0, array.length);
            return sortedWithMaxValue;
    }


    public static int[] sortingWithChoosingMinIncreasingValues(int[] array) {

        int[] sortedWithMinValue = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int tmp;
                if (array[i] < array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.arraycopy(array, 0, sortedWithMinValue, 0, array.length);
        return sortedWithMinValue;
    }


    public static int[] bubbleSortGrowing(int[] array) {
        int temp;
        int[] bubbleSorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            System.arraycopy(array, 0, bubbleSorted, 0, array.length);
//            for (int k = 0; k < array.length; k++) {
//                bubbleSorted[k] = array[k];
        }
        return bubbleSorted;
    }


    public static int[] bubbleSortGrowing2(int[] array) {
        int temp;
        int[] bubbleSorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            System.arraycopy(array, 0, bubbleSorted, 0, array.length);
        }
        return bubbleSorted;
    }


    public static int[] bubbleSortIncreasing1(int[] array) {
        int temp;
        int[] bubbleSorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - 1); j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.arraycopy(array, 0, bubbleSorted, 0, array.length);
        }
        return bubbleSorted;
    }


    public static int[] bubbleSortReducing(int[] array) {
        int temp;
        int[] bubbleSorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] < array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            System.arraycopy(array, 0, bubbleSorted, 0, array.length);
        }
        return bubbleSorted;
    }


    public static int[] bubbleSortReducing2(int[] array) {
        int temp;
        int[] bubbleSorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - 1); j++) {
                if (array[j] > array[j - 1]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            System.arraycopy(array, 0, bubbleSorted, 0, array.length);
        }
        return bubbleSorted;
    }


    public static int binarySearch(int[] array, int number) {
        int left = 0;
        int right = array.length-1;
        int mid;
        int result = -1;

        if (number >= array[0] && number <= array[array.length-1])
            for (int i = 0; i < array.length; i++) {
                if (left <= right) {
                    mid = left + (right - left) / 2;
                    if (number < array[mid]) {
                        right = mid - 1;
                    } else if (number > array[mid]) {
                        left = mid + 1;
                    } else {
                        result = mid;
                    }
                }
            }
        return result;
    }
}