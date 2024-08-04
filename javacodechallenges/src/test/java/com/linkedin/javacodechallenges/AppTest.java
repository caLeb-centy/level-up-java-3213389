package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void name() {
        Person test = new Person();
        test.setfirstName("John");
        test.setlastName("Doe");
        assertEquals("John", test.getfirstName());
        assertEquals("Doe", test.getlastName());
    }

    @Test
    public void age() {
        Person test = new Person();
        test.setAge(25);
        assertEquals(25, test.getAge());
    }

}
