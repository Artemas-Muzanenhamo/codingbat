package string1;

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

    @Test
    public void whenEmptyStringsIsPassedThenReturnEmptyValue(){
        assertEquals("", MakeAbba.makeAbba("", ""));
    }

    @Test
    public void whenStringsArePassedInThenReturnStringInAbbaFormat(){
        assertEquals("HiByeByeHi", MakeAbba.makeAbba("Hi", "Bye"));

        //lazy
        assertEquals("YoAliceAliceYo", MakeAbba.makeAbba("Yo", "Alice"));
        assertEquals("WhatUpUpWhat", MakeAbba.makeAbba("What", "Up"));
    }

    @Test
    public void whenOneOfTheStringsIsEmptyThenReturn(){
        assertEquals("XX", MakeAbba.makeAbba("X", ""));
    }

}
