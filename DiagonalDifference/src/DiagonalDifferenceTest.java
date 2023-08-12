import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiagonalDifferenceTest {
    @Test
    void calculateDiagonalDifferenceTest(){
        Assertions.assertEquals(0,DiagonalDifference.calculateDiagonalDifference(new int[][]{}));
    }
}
