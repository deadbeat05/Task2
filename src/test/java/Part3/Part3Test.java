package Part3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Part3Test {

    @Test
    public void getMergedList() {

        List<Employee> list = new ArrayList<>();
        List<Employee> list2 = new ArrayList<>();
        Manager manager1 = new Manager();
        Manager manager2 = new Manager();
        Manager manager3 = new Manager();
        Programmer programmer1 = new Programmer();
        Programmer programmer2 = new Programmer();

        manager1.setWorkRate(100);
        manager2.setWorkRate(130);
        manager3.setWorkedHours(110);
        programmer1.setWorkedHours(120);
        programmer2.setWorkRate(140);

        list.add(programmer2);
        list.add(manager3);
        list.add(manager1);

        list2.add(programmer1);
        list2.add(manager2);

        int actual = Part3.getMergedList(list,list2).size();
        int expected = 2;
        assertEquals(expected,actual);
    }
}