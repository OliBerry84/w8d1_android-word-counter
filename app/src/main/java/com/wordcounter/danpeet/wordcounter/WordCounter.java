package com.wordcounter.danpeet.wordcounter;

import java.util.HashMap;

/**
 * Created by danpeet on 19/03/2018.
 */

public class WordCounter {
    private String inputString;
    private HashMap<String, Integer> wordCount;

    public WordCounter(String inputString) {
        this.inputString = inputString;
        countWords();
    }

    private void countWords() {
        wordCount = new HashMap<>();
        String[] words = splitString();
        Integer count;
        for (String word : words) {
            count = wordCount.get(word);
            if (count == null) {
                wordCount.put(word.toLowerCase(), 1);
            } else {
                wordCount.put(word.toLowerCase(), count + 1);
            }
        }
    }

    private String[] splitString() {
        return inputString.split("[ ,.!]");
    }

    public String getInputString() {
        return inputString;
    }

    public HashMap<String, Integer> getWordCount() {
        return wordCount;
    }
}
