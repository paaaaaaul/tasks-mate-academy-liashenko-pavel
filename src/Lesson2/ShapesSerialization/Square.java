package Lesson2.ShapesSerialization;

public class Square implements Shape {

    private int sideLength;

    public Square(int sideLength) {
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
        System.out.println("Square side length: " + getSideLength());
    }
}
