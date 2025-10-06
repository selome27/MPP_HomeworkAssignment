package lesson5.prob2;


import lesson5.prob2.duck.DecoyDuck;
import lesson5.prob2.duck.MallardDuck;
import lesson5.prob2.duck.RedheadDuck;
import lesson5.prob2.duck.RubberDuck;

public class Main {
    public static void main(String[] args){
        Duck[] ducks =
                {new MallardDuck(),new DecoyDuck(),new RedheadDuck(),new RubberDuck()};
        for(Duck d : ducks ){
            System.out.println(d.getClass().getSimpleName() + ":");
            d.display();
            d.fly();
            d.quack();
            d.swim();
        }
    }
}
