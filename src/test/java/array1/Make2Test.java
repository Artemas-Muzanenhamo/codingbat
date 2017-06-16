package array1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Artemas on 16/06/2017.
 *
 * Given 2 int arrays, a and b,
 *
 * return a new array length 2 containing,
 * as much as will fit, the elements from a followed by the elements from b.
 *
 * The arrays may be any length, including 0,
 * but there will be 2 or more elements available between the 2 arrays.
 *
 * make2([4, 5], [1, 2, 3]) → [4, 5]
 * make2([4], [1, 2, 3]) → [4, 1]
 * make2([], [1, 2]) → [1, 2]
 */
public class Make2Test {

    private int[] a = {};
    private int[] b = {};

    private int[] expectedArray = {};

    @Test
    public void whenAnEmptyArraysArePassedThenReturnEmptyArrays(){
        assertArrayEquals(expectedArray, Make2.make2(a, b));
    }

    @Test
    public void whenTheRightArrayHasNoValueThenReturnTheLeftArrayValue(){

        a = new int[]{1, 2};

        expectedArray = new int[]{1, 2};

        assertArrayEquals(expectedArray, Make2.make2(a, b));
    }

    @Test
    public void whenTheLeftArrayHasNoValueThenReturnTheRightArrayValue(){

        b = new int[]{1, 2};

        expectedArray = new int[]{1, 2};

        assertArrayEquals(expectedArray, Make2.make2(a, b));
    }

    @Test
    public void whenBothArraysHaveOneElementThenReturnBothElementsAsOneArray(){

        a = new int[]{1};
        b = new int[]{2};

        expectedArray = new int[]{1, 2};

        assertArrayEquals(expectedArray, Make2.make2(a, b));
    }

    @Test
    public void whenLeftArrayHas2ElementsThenReturnLeftArrayValues(){

        a = new int[]{1, 3};
        b = new int[]{2};

        expectedArray = new int[]{1, 3};

        assertArrayEquals(expectedArray, Make2.make2(a, b));
    }

    @Test
    public void whenRightArrayHas2ElementsThenReturnRightArrayValues(){

        a = new int[]{1};
        b = new int[]{2, 3};

        expectedArray = new int[]{1, 2};

        assertArrayEquals(expectedArray, Make2.make2(a, b));

    }

}
