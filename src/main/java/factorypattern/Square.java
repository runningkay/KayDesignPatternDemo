package factorypattern;

/**
 * Created by Nozomi on 2016/9/23.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
