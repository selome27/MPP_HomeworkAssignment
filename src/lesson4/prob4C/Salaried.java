package lesson4.prob4C;

public class Salaried extends Employee{
    private double salary;

    public Salaried(int empId, double salary) {
        super(empId);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public double calGrossPay( String month,String yr){
        return salary;
    }

}
