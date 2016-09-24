package abstractfactorypattern;

/**
 * Created by Nozomi on 2016/9/23.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}