package Part2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Part2Test {

    @Test
    public void coder() {
        String actual = Part2.coder("G");
        String expected = "00 0 0 0 00 000 0 000";
        assertEquals(expected,actual);
    }
    @Test
    public void coderIncorrectLength() {
        String actual = Part2.coder("");
        String expected = null;
        assertEquals(expected,actual);
    }
}