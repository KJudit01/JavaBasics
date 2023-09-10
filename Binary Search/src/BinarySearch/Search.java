package BinarySearch;

import java.util.Arrays;

public class Search {
    public Search() {

    }

    int search(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(int[] array, int number) {
        Arrays.sort(array);
        return binarySearch(array, number, 0, array.length - 1);
    }

    int binarySearch(int[] array, int number, int left, int right) {
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
        //fogom az intervallum felét
        //megnézem, hogy a keresendő szám egyenlő-e ezzel az értékkel
        //ha igen, visszatérek az indexszel
        //megnézem, hogy a keresendő szám nagyobb-e vagy kisebb-e ennél
        //ha nagyobb, akkor a számtól jobbra lévő számokkal megcsinálom ugyanezt
        //ha már csak 1 méretű a tömböm, és az az elem nem egyezik meg a keresendővel, akkor visszatérek -1-gyel
    }

     /*int binarySearch(int[] array, int number, int offset) {
        int middleElement = array[array.length / 2];
        if (number == middleElement) {
            return offset + array.length / 2;
        } else if (array.length == 1) {
            return -1;
        } else if (number > middleElement) {
            return binarySearch(Arrays.copyOfRange(array, array.length / 2 + 1, array.length), number, offset + array.length / 2);
        } else {    //if(number < middleElement)//
            return binarySearch(Arrays.copyOfRange(array, 0, array.length / 2), number, offset);
        }*/
}


