package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 22/04/2017.
 *
 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
 * Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

 makeTags("i", "Yay") → "<i>Yay</i>"
 makeTags("i", "Hello") → "<i>Hello</i>"
 makeTags("cite", "Yay") → "<cite>Yay</cite>"
 */
public class MakeTagsTest {

    private MakeTags makeTags;

    @Before
    public void init(){
        makeTags = new MakeTags();
    }

    @Test
    public void whenEmptyStringsArePassedThenReturnEmptyValue(){
        assertEquals("<></>", makeTags.makeTags("", ""));
    }

    @Test
    public void whenTagIsPassedButStringIsEmptyThenReturnStringWithTagsOnly(){
        assertEquals("<i></i>", makeTags.makeTags("i", ""));
    }

    @Test
    public void whenWordIsPassedButTheTagStringIsEmptyThenReturnStringWithEmptyTagsOnly(){
        assertEquals("<>Hello</>", makeTags.makeTags("", "Hello"));
    }

    @Test
    public void whenBothTagAndWordArePassedInThenReturnStringWithHtmlTag(){
        assertEquals("<i>Yay</i>", makeTags.makeTags("i", "Yay"));

        //lazy
        assertEquals("<cite>Yay</cite>", makeTags.makeTags("cite", "Yay"));
    }
}
