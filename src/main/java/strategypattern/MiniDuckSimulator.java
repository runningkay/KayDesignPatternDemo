package strategypattern;

public class MiniDuckSimulator {
    public static void main(String args[])
    {
        Duck redheadduck=new RedheadDuck();
        redheadduck.performFly();
        redheadduck.performQuack();
        redheadduck.setFlyBehavior(new FlyRocketPowered());
        redheadduck.performFly();
    }
}
