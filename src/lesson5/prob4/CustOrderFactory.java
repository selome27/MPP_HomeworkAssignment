package lesson5.prob4;

import java.time.LocalDate;

public class CustOrderFactory {
  public static Customer newCustomer(String name){
      return new Customer(name);
  }
  public static Order newOrder(Customer cust , LocalDate date){
      return Order.newOrder(cust,date);
  }
  public static Item newItem(String name){
      return  Item.newItem(name);
  }
}
