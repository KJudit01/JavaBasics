import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void testGetSum() {
        Assertions.assertEquals(200, Calculator.getSum(100, 100));
        Assertions.assertEquals(1000, Calculator.getSum(100, 900));
    }

    @Test
    void testGetSubtraction() {
        Assertions.assertEquals(500, Calculator.getSubtraction(1000, 500));
    }

    @Test
    void testGetMultiplication() {
        Assertions.assertEquals(25, Calculator.getMultiplication(5, 5));
    }

    @Test
    void testGetDivision() {
        Assertions.assertEquals(10, Calculator.getDivision(100, 10));
    }

    @Test
    void testModularDivision() {
        Assertions.assertEquals(0, Calculator.getModularDivision(25, 5));
        Assertions.assertEquals(21,Calculator.getModularDivision(51,30));
    }

    @Test
    void testGetPower() {
        Assertions.assertEquals(100, Calculator.getPower(10, 2));
    }

    @Test
    void testGetPercentage() {
        Assertions.assertEquals(200, Calculator.getPercentage(1000, 20));
    }

    @Test
    void testGetFactorial() {
        Assertions.assertEquals(120, Calculator.getFactorial(5));
    }

    @Test
    void testGetSquareRoot() {
        Assertions.assertEquals(4, Calculator.getSquareRoot(16));
    }
}
