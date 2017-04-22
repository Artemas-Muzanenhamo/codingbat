package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 22/04/2017.
 *
 * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>".
 * Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
 *
 * makeOutWord("<<>>", "Yay") → "<<Yay>>"
 * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
 * makeOutWord("[[]]", "word") → "[[word]]"
 */
public class MakeOutWordTest {

    @Test
    public void whenEmptyStringsArePassedThenReturnEmptyStringAsIs(){
        assertEquals("", MakeOutWord.makeOutWord("", ""));
    }

    @Test
    public void whenTheOutStringIsEmptyButTheWordStringIsPassedThenReturnTheWordOnly(){
        assertEquals("Hello", MakeOutWord.makeOutWord("", "Hello"));
    }

    @Test
    public void whenTheWordStringIsEmptyButTheOutStringIsPassedThenReturnTheOutOnly(){
        assertEquals("<<>>", MakeOutWord.makeOutWord("<<>>", ""));
    }

    @Test
    public void whenBothTheOutStringAndTheWordStringArePassedThenReturnTheOutWithTheStringInTheMiddle(){
        assertEquals("<<Yay>>", MakeOutWord.makeOutWord("<<>>", "Yay"));

        //lazy
        assertEquals("<Artemas>", MakeOutWord.makeOutWord("<>", "Artemas"));
    }

}
