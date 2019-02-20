package com.stackroute.practice4;

import java.util.*;

//3. Write a program that sets up a String variable containing a paragraph of text of your choice.
//        a. Extract the words from the text and sort them into alphabetical order.
//        b. Display the sorted list of words.

public class SortList {
    //method to sort a List
    static List<String> sortString (String userInput){
        List<String> result = new ArrayList<>();
        result.addAll(Arrays.asList(userInput.split(" ")));
        Collections.sort(result);
        return result;
    }
}
