package string2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by artemasm on 26/07/2017.
 *
 * Return true if the string "cat" and "dog" appear the same number of times in the given string.
 *
 * catDog("catdog") → true
 * catDog("catcat") → false
 * catDog("1cat1cadodog") → true
 */
public class CatDogTest {

    @Test
    public void whenCatDogAppearsInTheStringPassedThenReturnTrue(){
        assertTrue(CatDog.catDog("catdog"));

        //lazy
        assertTrue(CatDog.catDog("1cat1cadodog"));
    }

    @Test
    public void whenCatDogDoesNotAppearInTheStringPassedThenReturnFalse(){
        assertFalse(CatDog.catDog("catcat"));
    }

}
