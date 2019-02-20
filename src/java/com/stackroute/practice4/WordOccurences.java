package com.stackroute.practice4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//6. Write a program to find out the multiple occurrences of the given word in a string using Matcher
//        methods.

public class WordOccurences {

    //method to count word occurences and find their start and end index
    static void countOccurences(String userInput, String toMatch){
        Pattern pattern = Pattern.compile(toMatch);
        Matcher matcher = pattern.matcher(userInput);
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("Found at: "+matcher.start() +"-"+ matcher.end());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String userInput = input.nextLine();
        System.out.println("Enter string to find: ");
        String toMatch = input.nextLine();
        countOccurences(userInput,toMatch);
    }
}
