package Lesson2.Shapes;

import java.util.List;

public class Circle implements FigureSize {
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


    @Override
    public void figureSize() {
        System.out.println(getColor());
    }



}
