package lesson4.prob4E;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accountList;

	public Employee(String name) {
		this.name = name;
		this.accountList = new ArrayList<>();
	}

	public String getName() {
		return name;
	}
	public void addAccount(Account acct){
		accountList.add(acct);
	}



	public double computeUpdatedBalanceSum() {
		//implement
		double totalSum = 0.0;
		for(Account a : accountList){
			totalSum += a.computeUpdatedBalance();
		}
		return totalSum;
	}
}
