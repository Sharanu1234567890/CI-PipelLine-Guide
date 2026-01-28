package org.example;

import org.junit.jupiter.api.Test;
//package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void testAdd() {
        assertEquals(6, Main.add(2, 3));
    }
}
