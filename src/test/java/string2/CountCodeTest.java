package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountCodeTest {
    private CountCode countCode;

    @Before
    public void setup() {
        countCode = new CountCode();
    }

    @Test
    public void should_return_0_when_string_doesnt_contain_the_word_co() {
        int actualCount = countCode.countCode("aaafdsfdsfbbb");

        assertEquals(0, actualCount);
    }

    @Test
    public void should_return_1_when_string_contains_the_word_co_once() {
        int actualCount = countCode.countCode("aaacodebbb");

        assertEquals(1, actualCount);
    }

    @Test
    public void should_return_2_when_string_contains_the_word_co_twice() {
        int actualCount1 = countCode.countCode("codexxcode");

        assertEquals(2, actualCount1);

        int actualCount2 = countCode.countCode("cozexxcope");

        assertEquals(2, actualCount2);
    }
}
