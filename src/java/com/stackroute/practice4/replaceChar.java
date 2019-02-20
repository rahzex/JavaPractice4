package com.stackroute.practice4;

public class replaceChar {
    static String replace(String userInput){
        userInput = userInput.replaceAll("d","f");
        userInput = userInput.replaceAll("l","t");
        return userInput;
    }
}
