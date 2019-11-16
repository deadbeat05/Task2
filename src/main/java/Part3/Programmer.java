package Part3;

import java.util.Objects;

public class Programmer extends Employee {
    private double workRate;
    private double workedHours;

    final int norm = 160;


    public double getWorkRate() {
        return workRate;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    @Override
    public boolean setWorkRate(double workRate) {
        this.workRate = workRate;
        return workRate != 0;
    }

    @Override
    public boolean setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
        return this.workedHours!=0;
    }

    @Override
    public double getPercentWorkedHours() {
        return workedHours * 100 / norm;
    }

    @Override
    public double getSalaryPerMonth() {
        return getPercentWorkedHours()*workRate/100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Programmer)) return false;
        Programmer that = (Programmer) o;
        return Double.compare(that.workRate, workRate) == 0 &&
                Double.compare(that.workedHours, workedHours) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(workRate, workedHours);
    }
}
