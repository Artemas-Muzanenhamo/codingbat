package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 22/04/2017.
 * Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
 *
 * makeAbba("Hi", "Bye") → "HiByeByeHi"
 * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
 * makeAbba("What", "Up") → "WhatUpUpWhat"
 */
public class MakeAbbaTest {
    
    private MakeAbba makeAbba;
    
    @Before
    public void init(){
        makeAbba = new MakeAbba();
    }

    @Test
    public void whenEmptyStringsIsPassedThenReturnEmptyValue(){
        assertEquals("", makeAbba.makeAbba("", ""));
    }

    @Test
    public void whenStringsArePassedInThenReturnStringInAbbaFormat(){
        assertEquals("HiByeByeHi", makeAbba.makeAbba("Hi", "Bye"));

        //lazy
        assertEquals("YoAliceAliceYo", makeAbba.makeAbba("Yo", "Alice"));
        assertEquals("WhatUpUpWhat", makeAbba.makeAbba("What", "Up"));
    }

    @Test
    public void whenOneOfTheStringsIsEmptyThenReturn(){
        assertEquals("XX", makeAbba.makeAbba("X", ""));
    }

}
