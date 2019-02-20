package com.stackroute.practice4;

import org.junit.Test;

import static org.junit.Assert.*;

public class replaceCharTest {

    @Test
    public void replace() {
        assertEquals("faity fry",replaceChar.replace("daily dry"));
        assertEquals("fff ttt",replaceChar.replace("ddd lll"));
    }
}