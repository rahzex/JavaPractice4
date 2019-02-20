package com.stackroute.practice4;

//2. Write a program to replace all d with f and all l with t in the given String
//        Input: daily dry
//        Output: faity fry
//        Original string: daily dry
//        New String: faity fry

public class ReplaceChar {
    //method to replace d with f & l with t
    static String replace(String userInput){
        userInput = userInput.replaceAll("d","f");
        userInput = userInput.replaceAll("l","t");
        return userInput;
    }
}
