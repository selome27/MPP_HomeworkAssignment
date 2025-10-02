package lesson2.prob2B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private int orderNum;
    private List<OrderLine> ol ;



    public Order(int orderNum) {
        this.orderNum = orderNum;
        //ol = Arrays.asList(new OrderLine(this));
        ol = new ArrayList<>();


    }
    public void addOrderLine(){

        OrderLine line = new OrderLine(this);
        ol.add(line);
    }

    public int getOrderNum() {
        return orderNum;
    }

    public List<OrderLine> getOl() {
        return ol;
    }
}



