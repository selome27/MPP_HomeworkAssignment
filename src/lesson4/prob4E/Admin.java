package lesson4.prob4E;

import java.util.List;

public class Admin {

	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double UpdatedBalanceSum = 0.0;
		 for(Employee e : list){
			 UpdatedBalanceSum += e.computeUpdatedBalanceSum();
		 }
		 return UpdatedBalanceSum;
	}
}
