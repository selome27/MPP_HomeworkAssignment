package lesson4.prob4C;

public final class Paycheck {
    private double grossPay;
    private double fica;
    private double state;
    private double local;
    private double medicare;
    private double socialSecurity;

    public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }

    public double getNetPay(){
       double deduct = grossPay * (fica + state + local + medicare + socialSecurity);
       return grossPay - deduct;
    }
    public void print(){
        System.out.println("grossPay " + grossPay);
        System.out.println("getNetPay   " + getNetPay());
    }
}
