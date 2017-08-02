package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Artemas on 26/06/2017.
 *
 * The squirrels in Palo Alto spend most of the day playing.
 *
 * In particular, they play if the temperature is between 60 and 90 (inclusive).
 *
 * Unless it is summer, then the upper limit is 100 instead of 90.
 *
 * Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
 *
 * squirrelPlay(70, false) → true
 * squirrelPlay(95, false) → false
 * squirrelPlay(95, true) → true
 */
public class SquirrelPlayTest {
    
    private SquirrelPlay squirrelPlay;
    
    @Before
    public void init(){
        squirrelPlay = new SquirrelPlay();
    }

    @Test
    public void whenTemperatureIsBelow60AndNotSummerThenReturnFalse(){

        assertFalse(squirrelPlay.squirrelPlay(50, false));

    }

    @Test
    public void whenTemperatureIsBelow60AndIsSummerThenReturnFalse(){

        assertFalse(squirrelPlay.squirrelPlay(50, true));

    }

    @Test
    public void whenTemperatureIsAbove60AndNotSummerThenReturnTrue(){

        assertTrue(squirrelPlay.squirrelPlay(60, false));

    }

    @Test
    public void whenTemperatureIsAbove60AndIsSummerThenReturnTrue(){

        assertTrue(squirrelPlay.squirrelPlay(70, true));

    }

    @Test
    public void whenTemperatureIsAbove90AndIsNotSummerThenReturnFalse(){

        assertFalse(squirrelPlay.squirrelPlay(95, false));

    }

    @Test
    public void whenTemperatureIsAbove90AndIsSummerThenReturnTrue(){

        assertTrue(squirrelPlay.squirrelPlay(95, true));

    }

}
