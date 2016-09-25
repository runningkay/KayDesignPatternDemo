package prototypepattern;

/**
 * Created by Bo-Young on 2016/9/25.
 */
public class Square extends Shape {
    public Square(){
        type="Square";
    }

    @Override
    public void draw(){
        System.out.println("Inside Square::draw() method.");
    }
}
