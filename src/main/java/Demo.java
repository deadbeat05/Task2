import Part1.Part1;
import Part2.Part2;
import Part3.Part3;
import Part3.*;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //Task 2.1
        Part1.interviewRecursionTest("healo");

        //Task 2.2
        Part2.coder("Hi");

        //Task 2.3
        List<Employee> manager = new ArrayList<>();
        List<Employee> programmer = new ArrayList<>();
        Manager manager1 = new Manager();
        Manager manager2 = new Manager();
        Manager manager3 = new Manager();
        Programmer programmer1 = new Programmer();
        Programmer programmer2 = new Programmer();

        manager1.setWorkRate(100);
        manager2.setWorkRate(130);
        manager3.setWorkRate(170);
        programmer1.setWorkRate(120);
        programmer2.setWorkRate(140);

        manager.add(programmer2);
        manager.add(programmer1);
        manager.add(manager3);
        manager.add(manager1);

        programmer.add(programmer1);
        programmer.add(manager2);
        Part3.getMergedList(manager,programmer);
    }
}
