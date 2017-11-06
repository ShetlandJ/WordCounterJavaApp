package myfirstgame.wordcounter;

/**
 * Created by James on 06/11/2017.
 */

public class Runner {

    public static void main(String[] args) {
        WordCounter wc = new WordCounter();

        System.out.println(wc.countWordsUsingMap("Hello my name my is"));
    }


}
