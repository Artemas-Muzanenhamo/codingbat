package array1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 26/05/2017.
 *
 * Start with 2 int arrays, a and b, of any length.
 *
 * Return how many of the arrays have 1 as their first element.
 *
 * start1([1, 2, 3], [1, 3]) → 2
 * start1([7, 2, 3], [1]) → 1
 * start1([1, 2], []) → 1
 */
public class Start1Test {

    private int[] actualArray1 = {};
    private int[] actualArray2 = {};

    private int[] expectedArray1 = {};
    private int[] expectedArray2 = {};

    @Test
    public void whenEmptyArraysArePassedInTheReturn0(){
        assertEquals(0, Start1.start1(actualArray1, actualArray2));
    }

    @Test
    public void whenTheLeftArrayContains1AsTheFirstIndexValueThenReturn1(){

        actualArray1 = new int[2];
        actualArray1[0] = 1;
        actualArray1[1] = 2;

        assertEquals(1, Start1.start1(actualArray1, actualArray2));
    }

    @Test
    public void whenTheRightArrayContains1AsTheFirstIndexValueThenReturn1(){

        actualArray2 = new int[2];
        actualArray2[0] = 1;
        actualArray2[1] = 2;

        assertEquals(1, Start1.start1(actualArray1, actualArray2));
    }

    @Test
    public void whenBothArraysContain1AsTheFirstIndexValueThenReturn2(){

        actualArray1 = new int[2];
        actualArray1[0] = 1;
        actualArray1[1] = 2;

        actualArray2 = new int[2];
        actualArray2[0] = 1;
        actualArray2[1] = 2;

        assertEquals(2, Start1.start1(actualArray1, actualArray2));
    }


}
