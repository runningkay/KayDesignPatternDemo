package BuilderPattern;

/**
 * Created by Bo-Young on 2016/9/25.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
