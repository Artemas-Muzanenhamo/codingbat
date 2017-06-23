package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artemas on 23/06/2017.
 *
 * You and your date are trying to get a table at a restaurant.
 *
 * The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes.
 *
 * The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
 *
 * If either of you is very stylish, 8 or more, then the result is 2 (yes).
 *
 * With the exception that if either of you has style of 2 or less, then the result is 0 (no).
 *
 * Otherwise the result is 1 (maybe).
 *
 * dateFashion(5, 10) → 2
 * dateFashion(5, 2) → 0
 * dateFashion(5, 5) → 1
 */
public class DateFashionTest {

    @Test
    public void whenYouOrYourDateAre8OrMoreThenReturn2(){

        assertEquals(2, DateFashion.dateFashion(8, 8));
    }

    @Test
    public void whenYourStyleIsLessThan3AndYourDateIsMoreThan8ThenReturn0(){
        assertEquals(0, DateFashion.dateFashion(2, 9));
    }

    @Test
    public void whenYouAndYourDateAreLessThan3ThenReturn0(){
        assertEquals(0, DateFashion.dateFashion(2, 1));
    }

    @Test
    public void whenYouAre5AndYourDateIs10ThenReturn2(){
        assertEquals(2, DateFashion.dateFashion(5, 10));
    }

    @Test
    public void whenYouAre5AndYourDateIs2ThenReturn0(){
        assertEquals(0, DateFashion.dateFashion(5, 2));
    }

    @Test
    public void whenYouAndYourDateAre5ThenReturn1(){
        assertEquals(1, DateFashion.dateFashion(5, 5));
    }

}
