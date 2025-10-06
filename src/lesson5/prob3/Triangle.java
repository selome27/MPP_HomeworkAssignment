package lesson5.prob3;

public final class Triangle implements Figure {
  private  double base , height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
      @Override
    public double computeArea(){
            return 1/2 * base * height;
        }
    }


