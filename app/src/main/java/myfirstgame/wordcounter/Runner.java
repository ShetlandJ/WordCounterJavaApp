package myfirstgame.wordcounter;

import java.util.Map;

/**
 * Created by James on 06/11/2017.
 */

public class Runner {

    public static void main(String[] args) {
        WordCounter wc = new WordCounter();

        Map<String, Integer> myMap = wc.countWordsUsingMap("Hello my name my is");
        System.out.println(wc.mapTree(myMap));
    }


}
