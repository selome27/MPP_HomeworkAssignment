package lesson2.prob2B;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
      Order o  = new Order(1);
      o.addOrderLine();
      o.addOrderLine();
      o.addOrderLine();
        System.out.println("Order  " + o.getOrderNum() + " has  " +   o.getOl().size() + " " + "orderlines");



    }
}
