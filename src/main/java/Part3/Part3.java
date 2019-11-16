package Part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections4.ListUtils;

public class Part3 {
    private static int maxWorkRate=40000;
    private static int minWorkRate=20000;
    private static int maxWorkedHours=160;
    private static int minWorkedHours=80;

    public static List<Employee> getMergedList(List<Employee> list1, List<Employee> list2) {
        List<Employee> merged = new ArrayList<>();
        Random random= new Random();
        for (Employee e : list2) {
            if (!list1.contains(e)) {
                list1.add(e);
            }
        }
        merged = ListUtils.intersection(list1, list2);
        for (Employee employee:merged) {
            employee.setWorkRate(random.nextInt(maxWorkRate-minWorkRate)+minWorkRate);
            employee.setWorkedHours(random.nextInt(maxWorkedHours-minWorkedHours)+minWorkedHours);
        }
        return merged;
    }

}
