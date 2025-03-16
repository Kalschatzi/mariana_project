package com.kalschatzi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void TestStaticMethodReturn() {
        assertEquals("HELLO, I'M A STRING!", Main.StaticMethod());
    }

    @Test
    public void FailingTest() {
        assertEquals("HELLO, I'M A FAILING TEST!", Main.StaticMethod());
    }

    @Test
    public void TestImmutableListGet() {
        assertEquals("A", Main.ListMethod());
    }

}
