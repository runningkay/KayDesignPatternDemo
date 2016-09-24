package abstractfactorypattern;

/**
 * Created by Nozomi on 2016/9/23.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
    //test
}
