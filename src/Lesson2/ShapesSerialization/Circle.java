package Lesson2.ShapesSerialization;

public class Circle implements Shape {

   private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void print() {
        System.out.println("Circle radius: " + getRadius());
    }
}
