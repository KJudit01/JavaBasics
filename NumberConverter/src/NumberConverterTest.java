import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberConverterTest {
    @Test
    void ConvertToWordsTest(){
        Assertions.assertEquals("one hundred and twenty",NumberConverter.convertToWords(120));
        Assertions.assertEquals("three million",NumberConverter.convertToWords(3000000));
        Assertions.assertEquals("three million six hundred and twenty-five thousand seven hundred and thirty-two",NumberConverter.convertToWords(3625732));
        Assertions.assertEquals("one",NumberConverter.convertToWords(1));
        Assertions.assertEquals("one hundred",NumberConverter.convertToWords(100));
        Assertions.assertEquals("one thousand",NumberConverter.convertToWords(1000));
        Assertions.assertEquals("one million",NumberConverter.convertToWords(1000000));
        Assertions.assertEquals("nine hundred and ninety-nine thousand nine hundred and ninety-nine",NumberConverter.convertToWords(999999));
        Assertions.assertEquals("nine hundred and ninety-nine million nine hundred and ninety-nine thousand nine hundred and ninety-nine",NumberConverter.convertToWords(999999999));
        Assertions.assertEquals("nine hundred and ninety-nine billion nine hundred and ninety-nine million nine hundred and ninety-nine thousand nine hundred and ninety-nine",NumberConverter.convertToWords(999999999999L));
        Assertions.assertEquals("nine hundred and ninety-nine trillion nine hundred and ninety-nine billion nine hundred and ninety-nine million nine hundred and ninety-nine thousand nine hundred and ninety-nine",NumberConverter.convertToWords(999999999999999L));
        Assertions.assertEquals("one hundred thousand",NumberConverter.convertToWords(100000));
    }
}
