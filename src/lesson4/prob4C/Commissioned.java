package lesson4.prob4C;

import java.util.List;

public class Commissioned extends Employee{
    private double commission;
    private double baseSalary;
    private List<Order> order;

    public Commissioned(int empId, double commission, double baseSalary, List<Order> order) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.order = order;
    }

    public double getCommission() {
        return commission;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public List<Order> getOrder() {
        return order;
    }
   public void addOrder(Order  ord){
        order.add(ord);
   }
    public double calGrossPay(String month, String yr){

        double total = 0.0;
        for(Order o : order){
            String[] date= o.getOrderDate().split("/");
            String orderMonth = date[0];
            String orderYear = date[2];
            if(orderMonth.equals(month) && orderYear.equals(yr)){
                total += o.getOrderAmount();
            }
        }
        return baseSalary + commission * total;
    }
}
