package Lesson2.ShapesSerialization;

public class Triangle implements Shape {

    private int sideLength;

    public Triangle(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void print() {
        System.out.println("Triangle side length: " + getSideLength());
    }
}
