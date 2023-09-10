package BinarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    @Test
    void binarySearchTest(){
        Search search = new Search();
        int[] array = {1,2,3,4,5};
        Assertions.assertEquals(2,search.binarySearch(array,3));
        int[] array1 = {1,5,7,8,2,4,9};
        Assertions.assertEquals(1,search.binarySearch(array1,2));
        int[] array2 = {5,7,9,8,3,2,1,6,3};
        Assertions.assertEquals(7,search.binarySearch(array2,8));
        int[] array3 = {1,7,4,5,6};
        Assertions.assertEquals(1,search.binarySearch(array3,4));
    }
}
