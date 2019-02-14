package Lesson2.Shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesManipulation {
    public static void main(String[] args) {

        List<FigureSize> group = new ArrayList<>();

//        Group group = new Group();
//        Circle circle = new Circle(13, "blue");
//        Square square = new Square(48, "green");
//        Triangle triangle = new Triangle("red", 12, 45, 87);


        group.add(new Circle(13, "blue"));
        group.add(new Square(48, "green"));
        group.add(new Triangle("red", 12, 45, 87));

        Group group1 = new Group();
        group1.figureSize();

        for (FigureSize str: group) {
            System.out.println(str);
        }




//        SerializationJson.toJson(circle);
//        SerializationJson.toJson(square);
//        SerializationJson.toJson(triangle);
//
//        SerializationXml.toXml(circle);



    }
}

