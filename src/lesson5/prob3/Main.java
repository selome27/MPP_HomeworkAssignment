package lesson5.prob3;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void  main(String[] args){

        List<Figure> figures=  new ArrayList<>();
          figures.add(new Circle(4));
          figures.add(new Triangle(6,8));
          figures.add(new Rectangle(6,2));
          double totalSum = 0;
          for(Figure f : figures){
              totalSum += f.computeArea();

          }
        System.out.printf("Sum of Areas = %.2f" , totalSum);
    }
}
