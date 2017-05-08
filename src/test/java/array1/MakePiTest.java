package array1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by amuzanenhamo on 08/05/2017.
 *
 * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
 *
 * makePi() → [3, 1, 4]
 */
public class MakePiTest {

    @Test
    public void whenMethodIsCalledThenReturnPIValue314(){
        int[] arr = {3, 1, 4};
        assertArrayEquals(arr, MakePi.makePi());
    }

}
