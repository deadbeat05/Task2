package Part3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgrammerTest {

    @Test
    public void getPercentWorkedHours() {
        Programmer programmer = new Programmer();
        programmer.setWorkedHours(160);
        double actual= programmer.getPercentWorkedHours();
        double expected = 100;
        assertEquals(expected,actual,0.1);
    }

    @Test
    public void getSalaryPerMonth() {
        Programmer programmer = new Programmer();
        programmer.setWorkedHours(160);
        programmer.setWorkRate(40000);
        double actual = programmer.getSalaryPerMonth();
        double expected = 40000;
        assertEquals(expected,actual,0.1);
    }
}