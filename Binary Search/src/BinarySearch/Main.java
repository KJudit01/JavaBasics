package BinarySearch;

import static java.util.Arrays.binarySearch;

public class Main {
    public static void main(String[] args) {
        // int[] array = {1, 3, 4, 22, 23, 25, 27};
        int[] array = {1, 2, 3, 5, 6,7,8,9};
        int number = 5;
        int result = binarySearch(array, number);

        if (result != -1) {
            System.out.println("Number " + number + " found at index " + result);
        } else {
            System.out.println("Number " + number + " not found in the array.");
        }
        //length = 12
        //length / 2 == 6
        //{5, 6, 22, 31341, 6634634} --> 2-es indexű elem
        //6 + 2
        Search search = new Search();
        int indexOf21 = search.search(array, 21);
        int indexOf22 = search.search(array, 5);
        System.out.println(indexOf21);
        System.out.println(indexOf22);

        int indexOf21BinarySearch = search.binarySearch(array, 21);
        int indexOf22BinarySearch = search.binarySearch(array, 22);

        System.out.println(indexOf21BinarySearch);
        System.out.println(indexOf22BinarySearch);

    }
}
