package myfirstgame.wordcounter;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * Created by James on 06/11/2017.
 */

public class WordCounter {

    private String sentence;

    public WordCounter() {
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
    }

//    public HashMap<String, Integer> sentenceToHash(String sentence) {
//        int count = sentence.split("\\w+").length;
//        for (String word : sentence) {
//
//        }
//    }

//    public int word_count(String input_string){
//        input_string = "Alive is awesome";
//        return (input_string.trim().split(" ").length);
//    }

    public String countWordsUsingMap(String str) {
        String[] splitStr = str.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : splitStr) {
            if (wordCount.containsKey(word)) {
                // Map already contains the word key. Just increment it's count by 1
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // Map doesn't have mapping for word. Add one with count = 1
                wordCount.put(word, 1);
            }
        }

        return wordCount.toString();

    }

}
