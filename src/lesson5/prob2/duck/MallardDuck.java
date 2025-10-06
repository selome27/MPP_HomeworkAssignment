package lesson5.prob2.duck;

import lesson5.prob2.Duck;
import lesson5.prob2.FlyBehavior;
import lesson5.prob2.QuackBehavior;
import lesson5.prob2.fly.FlyWithWings;
import lesson5.prob2.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display(){
        System.out.println("display");
    }
}
