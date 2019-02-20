package com.stackroute.practice4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findName {
    static boolean find(String userinput){
        Pattern regex = Pattern.compile("Harry");
        Matcher match = regex.matcher(userinput);
        return match.find();
    }
}
