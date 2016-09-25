package prototypepattern;

/**
 * Created by Bo-Young on 2016/9/25.
 */
public class Circle extends Shape {
    public Circle(){
        type="Circle";
    }

    @Override
    public void draw(){
        System.out.println("Inside Circle::draw() method.");
    }
}
