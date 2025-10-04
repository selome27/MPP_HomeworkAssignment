package lesson4.prob4C;

public class Hourly extends Employee {
    private double hourlyWage;
    private double hoursPerWeek;


    public Hourly(int empId, double hourlyWage, double hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }
     @Override
    public double calGrossPay(String month, String yr){
        return hourlyWage * hoursPerWeek * 4;


    }
}
