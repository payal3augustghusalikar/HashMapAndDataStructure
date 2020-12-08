package com.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedHashMapTest {
    @Test
    public void givenSentence_WhenWordsAreAddedToList_ShouldReturnParanoidFrequency() {

        String sentence = "Paranoids are not paranoid because they are paranoid but because they " +
                "keep putting themselves deliberately into paranoid avoidable situations";

        MyLinkedHashMap<String, Integer> mylinkedHashMap = new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {
            Integer value = mylinkedHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value = value + 1;
            mylinkedHashMap.add(word, value);
        }

        int frequency = mylinkedHashMap.get("paranoid");
        System.out.println(mylinkedHashMap);
        Assert.assertEquals(3, frequency);
    }

    @Test
    public void givenString_WhenRemoveAWordFromPhrase_ShouldRemoveTheWordFromHashMap() {

        String sentence = "Paranoids are not paranoid because they are paranoid but because they " +
                "keep putting themselves deliberately into paranoid avoidable situations";

        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {

            Integer value = myLinkedHashMap.get(word);
            if (value == null) {
                value = 1;
            } else {
                value = value + 1;
            }
            myLinkedHashMap.add(word, value);
        }
        boolean result = myLinkedHashMap.removeWordFromPhrase("avoidable");
        System.out.println(myLinkedHashMap);
        Assert.assertTrue(result);
    }
}


