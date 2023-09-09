package StringUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    @Test
    void isStringSimilarTest(){
        Assertions.assertEquals(true,StringUtils.isStringSimilar("hello", "hello"));
        Assertions.assertEquals(false,StringUtils.isStringSimilar("Hi","car"));
    }
    @Test
    void countCharacterInStringTest(){
    Assertions.assertEquals(1,StringUtils.countCharacterInString("your",'y'));
    }
    @Test
    void repeatTextTest(){
        Assertions.assertEquals("hellohellohello",StringUtils.repeatText("hello",3));
    }
}
