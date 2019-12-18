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
        assertNull("Did not get null returned when argument passed was null", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
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