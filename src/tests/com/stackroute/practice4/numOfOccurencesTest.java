package com.stackroute.practice4;

import org.junit.Test;

import static org.junit.Assert.*;

public class numOfOccurencesTest {

    @Test
    public void countWordOccurence() {
        assertEquals(3,numOfOccurences.countWordOccurence("Java is java again java againjava count number of occurrence of a in the given","java"));
    }
}