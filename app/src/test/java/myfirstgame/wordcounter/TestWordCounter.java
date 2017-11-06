package myfirstgame.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by James on 06/11/2017.
 */

public class TestWordCounter {

    WordCounter wc;

    @Before
    public void setup() {
        wc = new WordCounter();
    }

    @Test
    public void canReturnCounterAsString() {
        assertEquals("{sentence=1, a=2, that=1, recurring=1, This=1, is=1, has=1, word=1}", wc.countWordsUsingMap("This is a sentence that has a recurring word"));
    }

}

