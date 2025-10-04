package lesson4.prob4E;
public class CheckingAccount extends Account{

    private String accountId;
    private double balance;
    private double monthlyFee;

    public CheckingAccount(String accountId, double balance, double monthlyFee) {
        this.accountId = accountId;
        this.balance = balance;
        this.monthlyFee = monthlyFee;
    }


    @Override
    public String getAccount(){
        return accountId;
    }
    @Override
    public  double getBalance(){
        return balance;
    }
    @Override
    public double computeUpdatedBalance() {
        return balance - monthlyFee;
    }
}
