package com.stackroute.practice4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharTest {

    @Test
    public void replace() {
        assertEquals("faity fry", ReplaceChar.replace("daily dry"));
        assertEquals("fff ttt", ReplaceChar.replace("ddd lll"));
    }
}