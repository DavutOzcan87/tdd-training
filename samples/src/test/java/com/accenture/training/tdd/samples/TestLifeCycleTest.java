package com.accenture.training.tdd.samples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestLifeCycleTest {

    StringReverse testLifeCycle = new StringReverse();

    @Test
    public void shouldDoNothingForEmptyString(){
        assertEquals( "" , testLifeCycle.reserveString(""));
    }

    @Test
    public void shouldReverseAString(){
        assertEquals("aaab" , testLifeCycle.reserveString("baaa") );
    }
}