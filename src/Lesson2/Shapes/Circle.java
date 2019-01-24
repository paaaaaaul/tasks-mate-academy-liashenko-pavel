package Lesson2.Shapes;

import java.io.Serializable;
import java.util.List;

public class Circle implements Serializable {
    private List<Circle> circles;
    private int diameter;
    private String color;

    public Circle() {}

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

    public String toJson() {

        String openingBr = "{" + "\n" + "\t";
        String closingBr =  "\n" + "}";
        String quote = "\"";
        String twoDots = ":";
        String comma = ",";



        System.out.println(openingBr + quote + "color" + quote + twoDots + " " + quote + color + quote + comma + "\n" +
                 "\t" + quote + "diameter" + quote + twoDots + " " + quote + diameter + quote + closingBr + comma);
        return "";
    }
}
