package cz.misina;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstTest {

    private Hello hello;

    @BeforeEach
    void setUp() {
        hello = new Hello("Name");
    }

    @Test
    void testNothing() {
    }

    @Test
    void testObjectCreation() {
        assertNotNull(hello);
    }

    @Test
    void testName() {
        assertEquals("Name", hello.getName());

    }

    @Test
    void testAge() {
        hello.setAge(40);

        assertEquals(40, hello.getAge());
    }
}
