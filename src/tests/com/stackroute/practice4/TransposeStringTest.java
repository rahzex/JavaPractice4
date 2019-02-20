package com.stackroute.practice4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {

    @Test
    public void transpose() {
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god", TransposeString.transpose("a quick brown fox jumps over the lazy dog"));
    }
}