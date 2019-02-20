package com.stackroute.practice4;

//1. Write a java program to count the total number of occurrences of a given character in a string
//        without using any loop?

public class NumOfOccurences {
    //method to find number of word occurences
    static int countWordOccurence(String userInput,String word){
        String replacedInput = userInput.replaceAll(word,"");
        System.out.println("userinput: " + userInput.length());
        System.out.println("afterReplace: " + replacedInput.length());
        int occurence = userInput.length() - replacedInput.length();
        return occurence/word.length();
    }
}
