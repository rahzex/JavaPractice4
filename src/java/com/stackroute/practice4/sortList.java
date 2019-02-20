package com.stackroute.practice4;

import java.util.*;

public class sortList {
    static List<String> sortString (String userInput){
        List<String> result = new ArrayList<>();
        result.addAll(Arrays.asList(userInput.split(" ")));
        Collections.sort(result);
        return result;
    }
}
