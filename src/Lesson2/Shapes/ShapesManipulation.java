package Lesson2.Shapes;

public class ShapesManipulation {
    public static void main(String[] args) {
        Group group = new Group();

        Figures circle = new Circle(13, "blue");
        Figures square = new Square(48, "green");
//        Figures triangle = new Triangle("red", 12, 45, 87);


        group.addShape(circle);
        group.addShape(square);

        group.toJson();

        Circle.toXml();


    }
}
