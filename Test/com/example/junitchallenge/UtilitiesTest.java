package com.example.junitchallenge;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @org.junit.Test
    public void everyNtChar() {
        fail("This test has not been implemented");
    }

    @org.junit.Test
    public void removePairs() {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @org.junit.Test
    public void converter() {
        fail("This test has not been implemented");
    }

    @org.junit.Test
    public void nullIfOddLenght() {
        fail("This test has not been implemented");
    }
}