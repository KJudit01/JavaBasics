import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiagonalDifferenceTest {
    @Test
    void calculateDiagonalDifferenceTest(){
        Assertions.assertEquals(0,DiagonalDifference.calculateDiagonalDifference(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        Assertions.assertEquals(-2,DiagonalDifference.calculateDiagonalDifference(new int[][]{{1, 2, 3, 4, 7},{5, 5, 5, 5, 2},{1, 1, 0, 0, 0},{0, 2, 3, 4, 1},{0, 1, 1, 2, 2}}));
        Assertions.assertEquals(-1,DiagonalDifference.calculateDiagonalDifference(new int[][]{{2,5,7,8},{3,2,3,9},{4,4,8,8}}));
    }
}
