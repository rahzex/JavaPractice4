package com.stackroute.practice4;

import org.junit.Test;

import static org.junit.Assert.*;

public class findNameTest {

    @Test
    public void find() {
        assertTrue(findName.find("Harry is Potter but not Dumb"));
        assertFalse(findName.find("hello is it me you are looking for?"));
    }
}