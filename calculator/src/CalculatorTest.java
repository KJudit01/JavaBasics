import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void testGetSum() {
        Assertions.assertEquals(200, Calculator.getSum(100, 100));
        Assertions.assertEquals(1000, Calculator.getSum(100, 900));
        Assertions.assertEquals(6623842,Calculator.getSum(5825342,798500));
    }

    @Test
    void testGetSubtraction() {
        Assertions.assertEquals(500, Calculator.getSubtraction(1000, 500));
        Assertions.assertEquals(157,Calculator.getSubtraction(782,625));
    }

    @Test
    void testGetMultiplication() {
        Assertions.assertEquals(25, Calculator.getMultiplication(5, 5));
        Assertions.assertEquals(43792,Calculator.getMultiplication(56,782));
    }

    @Test
    void testGetDivision() {
        Assertions.assertEquals(10, Calculator.getDivision(100, 10));
        Assertions.assertEquals(15.625,Calculator.getDivision(500,32));
        Assertions.assertEquals(187.5,Calculator.getDivision(9000,48));

    }

    @Test
    void testModularDivision() {
        Assertions.assertEquals(0, Calculator.getModularDivision(25, 5));
        Assertions.assertEquals(21,Calculator.getModularDivision(51,30));
        Assertions.assertEquals(2,Calculator.getModularDivision(125,3));
    }

    @Test
    void testGetPower() {
        Assertions.assertEquals(100, Calculator.getPower(10, 2));
        Assertions.assertEquals(216000,Calculator.getPower(60,3));
        Assertions.assertEquals(4096,Calculator.getPower(8,4));
    }

    @Test
    void testGetPercentage() {
        Assertions.assertEquals(200, Calculator.getPercentage(1000, 20));
        Assertions.assertEquals(1856,Calculator.getPercentage(5800,32));
        Assertions.assertEquals(6358,Calculator.getPercentage(9782,65));
    }

    @Test
    void testGetFactorial() {
        Assertions.assertEquals(120, Calculator.getFactorial(5));
        Assertions.assertEquals(40320,Calculator.getFactorial(8));
        Assertions.assertEquals(479001600,Calculator.getFactorial(12));
    }

    @Test
    void testGetSquareRoot() {
        Assertions.assertEquals(4, Calculator.getSquareRoot(16));
        Assertions.assertEquals(25.573423705088842,Calculator.getSquareRoot(654));
    }
}
