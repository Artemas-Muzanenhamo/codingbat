package string1;

import org.junit.Before;
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
    
    private MakeOutWord makeOutWord;
    
    @Before
    public void init(){
        makeOutWord = new MakeOutWord();
    }

    @Test
    public void whenEmptyStringsArePassedThenReturnEmptyStringAsIs(){
        assertEquals("", makeOutWord.makeOutWord("", ""));
    }

    @Test
    public void whenTheOutStringIsEmptyButTheWordStringIsPassedThenReturnTheWordOnly(){
        assertEquals("Hello", makeOutWord.makeOutWord("", "Hello"));
    }

    @Test
    public void whenTheWordStringIsEmptyButTheOutStringIsPassedThenReturnTheOutOnly(){
        assertEquals("<<>>", makeOutWord.makeOutWord("<<>>", ""));
    }

    @Test
    public void whenBothTheOutStringAndTheWordStringArePassedThenReturnTheOutWithTheStringInTheMiddle(){
        assertEquals("<<Yay>>", makeOutWord.makeOutWord("<<>>", "Yay"));

        //lazy
        assertEquals("<Artemas>", makeOutWord.makeOutWord("<>", "Artemas"));
    }

}
