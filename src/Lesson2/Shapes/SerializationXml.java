package Lesson2.Shapes;

import java.util.LinkedList;

public class SerializationXml {
    private static final String SERIALIZED_FILE = "figures.xml";

    public static void main(String[] args) {

    LinkedList<Circle> circles = new LinkedList<>();
        Circle circle1 = new Circle(13, "blue");
        Circle circle2 = new Circle(13, "blue");
        Circle circle3 = new Circle(13, "blue");
        Circle circle4 = new Circle(13, "blue");

        circles.add(circle1);
        circles.add(circle2);
        circles.add(circle3);
        circles.add(circle4);


        for (Circle cit :circles) {
            System.out.print(cit.toJson());
        }

//        circle1.toJson();



    LinkedList<Square> squares = new LinkedList<>();
        squares.add(new Square(13, "blue"));
        squares.add(new Square(1, "red"));
        squares.add(new Square(3, "your skin"));



    LinkedList<Triangle> triangles = new LinkedList<>();
        triangles.add(new Triangle("blue", 12, 23, 56));
        triangles.add(new Triangle("blue", 12, 23, 56));
        triangles.add(new Triangle("blue", 12, 23, 56));

        LinkedList allFigures = new LinkedList();
        allFigures.add(circles);
        allFigures.add(squares);
        allFigures.add(triangles);





    }
}
