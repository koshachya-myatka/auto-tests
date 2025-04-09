package ru.paramonova.autotestsapp;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {
    @Test
    public void test1() {
        assertEquals(18, 18);
    }

    @Test
    public void test2() {
        assertTrue(true);
    }
}
