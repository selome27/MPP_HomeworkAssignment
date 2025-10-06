package lesson5.prob2.duck;

import lesson5.prob2.Duck;
import lesson5.prob2.FlyBehavior;
import lesson5.prob2.QuackBehavior;
import lesson5.prob2.fly.FlyWithWings;
import lesson5.prob2.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display(){
        System.out.println("displaying");
    }
}
