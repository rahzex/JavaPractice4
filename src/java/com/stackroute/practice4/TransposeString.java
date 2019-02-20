package com.stackroute.practice4;

//4. Write a program to transpose the given string.
//        Input String : a quick brown fox jumps over the lazy dog
//        Output String: a kciuq nworb xof spmuj revo eht yzal god

public class TransposeString {
    //method to Transpose a String
    static String transpose(String userInput){
        String[] userInputArray = userInput.split(" ");
        String result = "";
        for (int i=0; i<userInputArray.length; i++){
            String reversed = new StringBuffer(userInputArray[i]).reverse().toString();
            result = result + reversed + " ";
        }
        return result.trim();
    }
}
