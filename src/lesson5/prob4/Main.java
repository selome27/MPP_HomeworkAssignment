package lesson5.prob4;

import java.time.LocalDate;



public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.newCustomer("Bob");
		Order order = CustOrderFactory.newOrder(cust, LocalDate.now());
		  CustOrderFactory.newItem(order,"shirt");

		order = CustOrderFactory.newOrder(cust, LocalDate.now());
		CustOrderFactory.newItem(order,"Pants");
		CustOrderFactory.newItem(order,"Knife set");

		System.out.println(cust.getOrders());
	}
}

		
