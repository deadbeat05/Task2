package Part1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Part1Test {

    @Test
    public void interviewRecursionTest() {
        String actual = Part1.interviewRecursionTest("healo");
        String expected = "h*e*a*l*o";
        assertEquals(expected,actual);
    }
}