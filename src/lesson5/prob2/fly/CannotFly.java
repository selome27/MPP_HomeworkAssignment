package lesson5.prob2.fly;

import lesson5.prob2.FlyBehavior;

public class CannotFly implements  FlyBehavior{
    public void fly() {
        System.out.println("can not fly");
    }
}
