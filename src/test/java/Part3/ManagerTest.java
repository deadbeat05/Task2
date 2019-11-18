package Part3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    @Test
    public void getPercentWorkedHours() {
        Manager manager  = new Manager();
        manager.setWorkedHours(100);
        double actual = manager.getPercentWorkedHours();
        double expected=62.5;
        assertEquals(expected,actual,0.1);
    }

    @Test
    public void getSalaryPerMonth() {
        Manager manager = new Manager();
        manager.setWorkedHours(100);
        manager.setWorkRate(40000);
        double actual= manager.getSalaryPerMonth();
        double expected = 25000;
        assertEquals(expected,actual,0.1);
    }
    @Test
    public void getSalaryPerMonthOverWorking() {
        Manager manager = new Manager();
        manager.setWorkedHours(200);
        manager.setWorkRate(40000);
        double actual= manager.getSalaryPerMonth();
        double expected = 40000;
        assertEquals(expected,actual,0.1);
    }
}