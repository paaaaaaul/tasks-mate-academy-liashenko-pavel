package Lesson2.Shapes;

public class Square {
    private String color;
    private int oneSideLength;

    public Square(){}

    public Square(int oneSideLength, String color) {
        this.color = color;
        this.oneSideLength = oneSideLength;
    }

    public String getColor() {
        return color;
    }

    public int getOneSideLength() {
        return oneSideLength;
    }
}
