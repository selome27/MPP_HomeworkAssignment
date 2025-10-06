package lesson5.prob2.duck;

import lesson5.prob2.Duck;
import lesson5.prob2.FlyBehavior;
import lesson5.prob2.QuackBehavior;
import lesson5.prob2.fly.CannotFly;
import lesson5.prob2.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new CannotFly(), new Squeak());
    }

    @Override
    public void display(){
        System.out.println("displaying");
    }
}
