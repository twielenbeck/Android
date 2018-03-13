package com.example.l117student.demotest;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by L117student on 2/15/2018.
 */

public class AdderTest {
    //public static int addTheNumbers(int a, int b)
    @Test
    public void addTheNumbersTest() {
        assertTrue("Adder produced incorrect return value: ", Adder.addTheNumbers(4,5) == 9);
        assertEquals("Adder produced the wrong number: ", 9, Adder.addTheNumbers(4,5));
    }

}
