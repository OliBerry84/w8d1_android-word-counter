package com.wordcounter.danpeet.wordcounter;

import android.util.Log;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by danpeet on 19/03/2018.
 */

public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCounter("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, ...");
    }

    @Test
    public void hasWords() {
        assertEquals("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, ...", wordCounter.getInputString());
    }

    @Test
    public void canCountWords() {
        HashMap wordCount = wordCounter.getWordCount();
        assertEquals(6, wordCount.get("it"));
        assertEquals(1, wordCount.get("worst"));
    }
}
