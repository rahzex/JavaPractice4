package com.stackroute.practice4;

public class numOfOccurences {
    static int countWordOccurence(String userInput,String word){
        String replacedInput = userInput.replaceAll(word,"");
        System.out.println("userinput: " + userInput.length());
        System.out.println("afterReplace: " + replacedInput.length());
        int occurence = userInput.length() - replacedInput.length();
        return occurence/word.length();
    }
}
