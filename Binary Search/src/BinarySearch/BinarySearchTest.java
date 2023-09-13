package BinarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    @Test
    void binarySearchTest(){
        Search search = new Search();
        int[] array = {1,2,3,4,5};
        Assertions.assertEquals(2,search.binarySearch(array,3));
        int[] array1 = {1,5,7,8,9,10,12};
        Assertions.assertEquals(3,search.binarySearch(array1,8));
        int[] array2 = {5,7,9,12,15,20,30};
        Assertions.assertEquals(6,search.binarySearch(array2,30));
        int[] array3 = {11,22,33,44};
        Assertions.assertEquals(3,search.binarySearch(array3,44));
        Assertions.assertEquals(0,search.binarySearch(array3,11));
        Assertions.assertEquals(4,search.binarySearch(array,5));
    }
}
