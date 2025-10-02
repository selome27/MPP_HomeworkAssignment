package lesson2.prob2B;

public class OrderLine {
    private Order o ;

    public OrderLine(Order order){
        //o = new Order(order);
        o  = order;
    }

    public Order getO() {
        return o;
    }
    @Override
    public String toString() {
        return "OrderLine for Order #" + o.getOrderNum();
    }

    // public OrderLine(Order order){
//     o = new Order();
//     o = order;
// }

}
