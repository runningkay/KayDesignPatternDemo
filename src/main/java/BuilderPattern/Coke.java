package BuilderPattern;

/**
 * Created by Bo-Young on 2016/9/25.
 */
public class Coke extends ColdDrink {
    @Override
    public float price(){
        return 30.0f;
    }

    @Override
    public String name(){
        return "Coke";
    }
}
