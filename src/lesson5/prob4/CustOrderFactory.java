package lesson5.prob4;

import java.time.LocalDate;

public class CustOrderFactory {
  public static Customer newCustomer(String name){
      return  new Customer(name);
  }
  public static Order newOrder(Customer cust , LocalDate date){
         if(cust == null) throw new NullPointerException("Null customer");
          Order ord = new Order(date);
          cust.addOrder(ord);
          return ord;
      }

  public static Item newItem(Order order , String name){
    if(order == null) throw new NullPointerException("Null order");
     Item item = new Item(name);
     order.addItem(item);
     return item;

  }
}
