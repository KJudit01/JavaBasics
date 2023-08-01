import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrongNumbersTest {
    @Test
    void testGetFactorial(){
        Assertions.assertEquals(6,StrongNumbers.getFactorial(3));
        Assertions.assertEquals(3628800,StrongNumbers.getFactorial(10));
        Assertions.assertEquals(720,StrongNumbers.getFactorial(6));
    }
    @Test
    void testIsStrong(){
        Assertions.assertFalse(StrongNumbers.isStrong(5));
        Assertions.assertFalse(StrongNumbers.isStrong(10));
        Assertions.assertTrue(StrongNumbers.isStrong(145));
    }
    @Test
    void testSumOfFactorial(){
        Assertions.assertEquals(120,StrongNumbers.sumOfFactorial(5));
        Assertions.assertEquals(145,StrongNumbers.sumOfFactorial(145));
        Assertions.assertEquals(745,StrongNumbers.sumOfFactorial(146));
    }


}
