package lesson5.prob2;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void fly() {
        flyBehavior.fly();  // delegate to FlyBehavior
    }

    public void quack() {
        quackBehavior.quack(); // delegate to QuackBehavior
    }

    public void swim() {
        System.out.println("swimming");
    }
    public abstract void display();

}
