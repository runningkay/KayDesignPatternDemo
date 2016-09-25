package prototypepattern;

/**
 * Created by Bo-Young on 2016/9/25.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type="Rectangle";
    }

    @Override
    public void draw(){
        System.out.println("Inside Rectangle::draw() method.");
    }
}
