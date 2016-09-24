package factorypattern;

/**
 * Created by Nozomi on 2016/9/23.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
