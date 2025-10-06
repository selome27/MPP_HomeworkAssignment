package lesson5.prob2.duck;

import lesson5.prob2.Duck;
import lesson5.prob2.FlyBehavior;
import lesson5.prob2.QuackBehavior;
import lesson5.prob2.fly.CannotFly;
import lesson5.prob2.fly.FlyWithWings;
import lesson5.prob2.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new CannotFly(), new MuteQuack());


    }

    @Override
    public void display(){
        System.out.println("displaying");
    }
}
