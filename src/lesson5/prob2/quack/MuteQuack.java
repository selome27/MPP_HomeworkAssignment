package lesson5.prob2.quack;

import lesson5.prob2.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("cannot quack");
    }
}
