package BuilderPattern;

/**
 * Created by Bo-Young on 2016/9/25.
 */
public class VegBurger extends Burger {
    @Override
    public float price(){
        return 25.0f;
    }

    @Override
    public String name(){
        return "Veg Burger";
    }
}
