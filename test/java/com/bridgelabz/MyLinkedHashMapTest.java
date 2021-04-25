package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MyLinkedHashMapTest {

    /*Finding frequency of words in a large paragraph phrase*/
    @Test
    public void giveASentence_whenWordsAreAddedToList_ShouldReturnWordFrequency() {
        String sentence = "Paranoids are not paranoid because they are paranoid "+
                "but because they keep putting themselves "+
                "deliberately into paranoid avoidable situations";
        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words) {
            Integer value = myLinkedHashMap.get(word);
            if(value == null)
                value = 1;
            else
                value = value + 1;
            myLinkedHashMap.add(word, value);
        }
        System.out.println(myLinkedHashMap);
        int frequency = myLinkedHashMap.get("paranoid");
        Assertions.assertEquals(3, frequency);
    }
}
