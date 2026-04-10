package utilss;

import geometry.Circle;
import geometry.Rectangle;

public class Calculator {

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(5, 5);

        double areaOfCircle = 3.14 * c1.getRadius() * c1.getRadius();
        System.out.println("Area of Circle: " + areaOfCircle);
    }
}
