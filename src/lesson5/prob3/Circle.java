package lesson5.prob3;

public final class Circle implements  Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
@Override
    public double computeArea(){
        return Math.PI * radius * radius;

    }
}
