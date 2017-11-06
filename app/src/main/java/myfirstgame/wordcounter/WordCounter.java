package myfirstgame.wordcounter;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

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

    public Map<String, Integer> countWordsUsingMap(String str) {
        String[] splitStr = str.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : splitStr) {
            if (wordCount.containsKey(word)) {

                wordCount.put(word, wordCount.get(word) + 1);
            } else {

                wordCount.put(word, 1);
            }
        }

        return wordCount;

    }

    public static <K,V extends Comparable<? super V>>
    SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
        SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<>(
                new Comparator<Map.Entry<K,V>>() {
                    @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                        int res = e1.getValue().compareTo(e2.getValue());
                        return res != 0 ? -res : 1;
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }

    public SortedSet<Map.Entry<String, Integer>> mapTree(Map<String, Integer> result){
        Map<String, Integer> treeMap = new TreeMap<>(result);
        return entriesSortedByValues(treeMap);
    }

    public String returnResult(Map<String, Integer> result){
        return mapTree(result).toString();
    }

}
