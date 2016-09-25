package BuilderPattern;

/**
 * Created by Bo-Young on 2016/9/25.
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price(){
        return 35.0f;
    }

    @Override
    public String name(){
        return "Pepsi";
    }
}
