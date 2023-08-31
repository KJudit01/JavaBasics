package BinarySearch;

import java.util.Arrays;

public class Search {
    public Search() {

    }

    public int search(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] array, int number) {
        Arrays.sort(array);
        return binarySearch(array, number, 0, array.length - 1);
    }

    private static int binarySearch(int[] array, int number, int left, int right) {
        if (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] == number) {
                return middle;
            } else if (array[middle] < number) {
                return binarySearch(array, number, middle + 1, right);
            } else {
                return binarySearch(array, number, left, middle - 1);
            }
        }
        return -1;
    }

    public int binarySearch(int[] array, int number, int offset) {
        int middleElement = array[array.length / 2];
        if (number == middleElement) {
            return offset + array.length / 2;
        } else if (array.length == 1) {
            return -1;
        } else if (number > middleElement) {
            return binarySearch(Arrays.copyOfRange(array, array.length / 2 + 1, array.length), number, offset + array.length / 2);
        } else {    //if(number < middleElement)//
            return binarySearch(Arrays.copyOfRange(array, 0, array.length / 2), number, offset);
        }
    }
}

