/**
 * Created by Bo-Young on 2016/9/20.
 */
public abstract class Beverage {
    String description="Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
