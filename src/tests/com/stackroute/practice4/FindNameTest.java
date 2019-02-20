package com.stackroute.practice4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNameTest {

    @Test
    public void find() {
        assertTrue(FindName.find("Harry is Potter but not Dumb"));
        assertFalse(FindName.find("hello is it me you are looking for?"));
    }
}