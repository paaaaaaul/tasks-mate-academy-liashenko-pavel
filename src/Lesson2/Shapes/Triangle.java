package Lesson2.Shapes;

public class Triangle implements FigureSize{
    private String color;
    private int sideALength;
    private int sideBLength;
    private int sideCLength;

    public Triangle(){}

    public Triangle(String color, int sideALength, int sideBLength, int sideCLength) {
        this.color = color;
        this.sideALength = sideALength;
        this.sideBLength = sideBLength;
        this.sideCLength = sideCLength;
    }

    public String getColor() {
        return color;
    }

    public int getSideALength() {
        return sideALength;
    }

    public int getSideBLength() {
        return sideBLength;
    }

    public int getSideCLength() {
        return sideCLength;
    }

    @Override
    public void figureSize() {
        System.out.println(getColor());
    }
}
