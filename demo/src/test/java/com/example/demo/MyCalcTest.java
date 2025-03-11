package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MyCalcTest {

    private static MyCalc myCalc;

    @BeforeAll
    static void setup() {
        myCalc = new MyCalc();
    }

	@Test
	void testSum1() {
        assertEquals(30, myCalc.sum(10, 20));
	}


    @Test
	void testSum2() {
        assertEquals(30, myCalc.sum(10, 20));
	}

    @Test
	void testSum3() {
        assertEquals(3, myCalc.sum(10, 20));
	}

    @Test
	void testdiff() {
        assertEquals(-10, myCalc.diff(10, 20));
	}

	

}
