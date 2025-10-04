package lesson4.prob4C;

public abstract class Employee {
    private int empId;

    public Employee(int empId ) {
        this.empId = empId;

    }

    public Paycheck calCompensation(String month , String year){
        double grossPay = calGrossPay(month, year);
        return  new  Paycheck(grossPay, 0.23, 0.05, 0.01, 0.03, 0.075);

    }

    public abstract double calGrossPay( String month,String yr);
    public void print() {
        System.out.println(empId);
    }
}
