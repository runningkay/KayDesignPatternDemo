/**
 * Created by Bo-Young on 2016/9/20.
 */
public class Soy extends Beverage {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }

    public double cost() {
        return beverage.cost() + .30;
    }
}
