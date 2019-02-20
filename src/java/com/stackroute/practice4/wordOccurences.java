package com.stackroute.practice4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wordOccurences {
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
