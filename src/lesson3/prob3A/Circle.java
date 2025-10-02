package lesson3.prob3A;
/*inheritance doesn’t make sense here because a cylinder is not a circle conceptually.*/
public class Circle  {
    private double radius;

    public Circle(double radius){

        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }
    public double computeArea(){
          return Math.PI * radius * radius;
    }
}
