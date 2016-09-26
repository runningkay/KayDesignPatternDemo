package bridgepattern;

/**
 * Created by Nozomi on 2016/9/26.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius,int x,int y){
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
