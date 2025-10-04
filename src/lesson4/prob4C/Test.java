package lesson4.prob4C;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){

        Employee e = new Hourly(3, 45, 67);
         Employee e1 = new Salaried(2,45);
        ArrayList<Order> orderList = new ArrayList<>();
        orderList.add(new Order(1, "10/2/2025", 100));
        orderList.add(new Order(3, "11/2/2025", 200));

        Commissioned c = new Commissioned(4, 0.05, 2000, orderList);

        Employee e2 = c;
        List<Employee> employees = new ArrayList<>();
        employees.add(e);
        employees.add(e1);
        employees.add(c);
        for(Employee emp : employees)
        emp.calCompensation("10", "2025").print();
        System.out.println();


    }
}
