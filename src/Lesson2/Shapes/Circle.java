package Lesson2.Shapes;

import java.io.Serializable;
import java.util.List;

public class Circle extends Figures implements Serializable {
    private List<Circle> circles;
    public static int diameter;
    private static String color;

    public void addToList(Circle circle) {
        circles.add(circle);
    }

    public Circle(int diameter, String color) {
        this.diameter = diameter;
        this.color = color;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getColor() {
        return color;
    }

    public static void toXml() {
            /*

            <xml>
                <color>color</color>
                <diameter>diameter</diameter>
            </xml>

             */

        System.out.println("<xml>" + "\n\t" + "<color>" + color + "</color>" + "\n\t" + "<diameter>" + diameter + "</diameter>" +
        "\n" + "</xml>" + ",");
    }
}
