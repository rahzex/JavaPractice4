package com.stackroute.practice4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SortListTest {

    @Test
    public void sortString() {
        String input = "you know you're in love when you can't fall asleep because reality is finally better than your dreams";
        List<String> output = new ArrayList<>();
        output.add("asleep");
        output.add("because");
        output.add("better");
        output.add("can't");
        output.add("dreams");output.add("fall");output.add("finally");
        output.add("in");output.add("is");output.add("know");
        output.add("love");output.add("reality");output.add("than");
        output.add("when");output.add("you");output.add("you");output.add("you're");
        output.add("your");
        assertEquals(output, SortList.sortString(input));
    }
}