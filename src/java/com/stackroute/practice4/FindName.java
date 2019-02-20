package com.stackroute.practice4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//5. Write a program with the implementation of Regular Expression to find the presence of the name
//        Harry in a string.
//        Input: This is Harry.
//        Output: Is Harry here ? true
//        Input : This is Henry.
//        Output: Is Harry here ? False

public class FindName {
    //method to Find Harry
    static boolean find(String userinput){
        Pattern regex = Pattern.compile("Harry");
        Matcher match = regex.matcher(userinput);
        return match.find();
    }
}
