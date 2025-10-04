package lesson4.prob4E;

import java.util.List;

public class SavingsAccount extends Account{
    private String savingId;
    private double balance;
    private double interestRate;

    public SavingsAccount(String savingId, double balance, double interestRate) {
        this.savingId = savingId;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    @Override
    public  String getAccount(){
        return getAccount();
    }
    @Override
    public  double getBalance(){
        return  balance;
    }
    @Override
    public double computeUpdatedBalance() {
        return balance + (interestRate * balance);
    }
}
