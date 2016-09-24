package abstractfactorypattern;

/**
 * Created by Nozomi on 2016/9/23.
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
