package com.stackroute.practice4;

public class transposeString {
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
