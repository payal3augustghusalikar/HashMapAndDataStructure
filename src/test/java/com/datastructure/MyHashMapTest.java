package com.datastructure;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyHashMapTest {

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("\n ******* welcome to Data structure ********");
    }

    @Test
    public void givenASentenceWhenWordsAreAddedToListShouldReturnWordFrequency() {
        String sentence = "To be or not to be";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<String, Integer>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words){
            Integer value = myHashMap.get(word);
            if(value == null) value = 1;
            else value = value + 1;
            myHashMap.add(word, value);
        }
        int frequency = myHashMap.get("to");
        System.out.println(myHashMap);
        Assert.assertEquals(2, frequency);
    }
}