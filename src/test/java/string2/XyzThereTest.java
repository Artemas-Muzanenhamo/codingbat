package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class XyzThereTest {

    private XyzThere xyzThere;

    @Before
    public void setUp() {
        xyzThere = new XyzThere();
    }

    @Test
    public void should_return_true_if_string_contains_xyz() {
        boolean actualString = xyzThere.xyzThere("abcxyz");

        assertTrue(actualString);
    }

    @Test
    public void should_return_false_if_string_contains_period_before_xyz() {
        boolean actualString = xyzThere.xyzThere("abc.xyz");

        assertFalse(actualString);
    }

    @Test
    public void should_return_false_if_string_doesnt_match_xyz() {
        boolean actualString = xyzThere.xyzThere("abc.efg");

        assertFalse(actualString);
    }

    @Test
    public void should_return_true_when_string_contains_xyz_doubled() {
        boolean actualString = xyzThere.xyzThere("abc.xyzxyz");

        assertTrue(actualString);
    }
}
