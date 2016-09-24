/**
 * Created by Bo-Young on 2016/9/20.
 */
public class Whip extends Beverage {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    public double cost() {
        return beverage.cost() + .40;
    }

}

