package Part3;

import java.util.Objects;

public class Manager extends Employee {
    private double workRate;
    private double workedHours;

    final int norm = 160;

    public double getWorkRate() {
        return workRate;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public boolean setWorkRate(double workRate) {
        this.workRate=workRate;
        return this.workRate!=0;
    }

    public boolean setWorkedHours(double workedHours) {
        this.workedHours=workedHours;
        return this.workedHours!=0;
    }

    public double getPercentWorkedHours() {
        return workedHours * 100 / norm;
    }

    public double getSalaryPerMonth() {
        if (getPercentWorkedHours()>=100){
            return workRate;
        }else {
            return getPercentWorkedHours()*workRate/100;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        Manager manager = (Manager) o;
        return Double.compare(manager.getWorkRate(), workRate) == 0 && Double.compare(manager.getWorkedHours(), workedHours) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(workRate, workedHours);
    }
}
