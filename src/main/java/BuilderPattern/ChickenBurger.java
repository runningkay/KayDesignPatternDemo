package BuilderPattern;

/**
 * Created by Bo-Young on 2016/9/25.
 */
public class ChickenBurger extends Burger {
    @Override
    public float price(){
        return 50.5f;
    }

    @Override
    public String name(){
        return "Chick Burger";
    }
}
