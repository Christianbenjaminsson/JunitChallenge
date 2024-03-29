package com.example.junitchallenge;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;

    @org.junit.Before
    public void setup() {
        util = new Utilities();
    }

    @org.junit.Test
    public void everyNtChar() {
        char[] output = util.everyNtChar( new char[] {'h', 'e', 'l', 'l', 'o'}, 2 );
        assertArrayEquals( new char[] {'e', 'l'}, output );
        char[] output2 = util.everyNtChar( new char[] {'h', 'e', 'l', 'l', 'o'}, 8 );
        assertArrayEquals( new char[] {'h', 'e', 'l', 'l', 'o', }, output2);
    }

    @org.junit.Test
    public void removePairs() {
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when argument passed was null", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
    }

    @org.junit.Test
    public void converter() {
        assertEquals( 300, util.converter( 10, 5));
    }

    @org.junit.Test( expected = ArithmeticException.class )
    public void converter_AritmeticException() throws Exception {
        util.converter(10, 0);
    }

    @org.junit.Test
    public void nullIfOddLenght() {
        assertNull( util.nullIfOddLenght("odd") );
        assertNotNull( util.nullIfOddLenght("even") );
    }
}