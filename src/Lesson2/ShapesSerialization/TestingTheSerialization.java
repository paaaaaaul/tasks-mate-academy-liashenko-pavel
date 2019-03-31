package Lesson2.ShapesSerialization;

import java.util.ArrayList;
import java.util.List;

public class TestingTheSerialization {
    public static void main(String[] args) {
        List<Shape> listA = new ArrayList<>();
        listA.add(new Circle(24));
        listA.add(new Square(19));
        listA.add(new Triangle(33));
        Shape groupA = new Group(listA);

        List<Shape> listB = new ArrayList<>();
        listB.add(new Circle(1));
        listB.add(new Square(5));
        listB.add(new Triangle(56));
        Shape groupB = new Group(listB);

        List<Shape> listC = new ArrayList<>();
        listC.add(new Triangle(90));
        listC.add(new Circle(45));
        listC.add(new Square(34));
        listC.add(groupA);
        listC.add(groupB);
        Shape mainList = new Group(listC);

        System.out.println("-----------XML-----------");
        System.out.println();
        System.out.println(SerializeXML.anyShapeEncoding(mainList));
    }
}
