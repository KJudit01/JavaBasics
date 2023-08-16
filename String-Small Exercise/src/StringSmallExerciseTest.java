import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringSmallExerciseTest {
    @Test
    void getHelloOccuranceTest(){
        Assertions.assertEquals(0,StringSmallExercise.getHelloOccurance("lovely string"));
        Assertions.assertEquals(4,StringSmallExercise.getHelloOccurance("helloabcdhelloasvbhellogdvmhello"));
        Assertions.assertEquals(1,StringSmallExercise.getHelloOccurance("helloBéla"));
    }
    @Test
    void getOccuranceOfBsTest(){
        Assertions.assertEquals(2,StringSmallExercise.getOccuranceOfBs("bBffFDGddbB"));
        Assertions.assertEquals(0,StringSmallExercise.getOccuranceOfBs("abc"));
    }
}
