package strategypattern;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("RedheadDuck display");
    }

}
