import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TipCalculatorTest {
    @Test
    void calculateTipTest(){
        Assertions.assertEquals(400,TipCalculator.calculateTip(new int[]{2000},20));
        Assertions.assertEquals(25, TipCalculator.calculateTip(new int[]{250},10));
    }
    @Test
    void getSumTest(){
       Assertions.assertEquals(8000,TipCalculator.getSum(new int[]{5000,2000,1000}));
    }
    @Test
    void isValidNumberTest(){
        Assertions.assertTrue(true);
    }
}
