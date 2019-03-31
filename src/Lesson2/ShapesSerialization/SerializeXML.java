package Lesson2.ShapesSerialization;

import java.util.List;

public class SerializeXML {

    public static String anyShapeEncoding(Shape shape) {
        String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        xmlString += shapeToXml(shape);
        return xmlString;
    }

    public static String shapeToXml(Shape shape) {
        String xmlString = "";
        if (shape instanceof Square) {
            xmlString += squareToXML((Square) shape);
        } else if (shape instanceof Triangle) {
            xmlString += triangleToXML((Triangle) shape);
        } else if (shape instanceof Circle) {
            xmlString += circleToXml((Circle) shape);
        } else if (shape instanceof Group) {
            xmlString += groupToXml((Group) shape);
        }
        return xmlString;
    }




    public static String triangleToXML(Triangle triangle) {
        String triangleXML = "<Triangle>\n";
        triangleXML += "\t<side>" + triangle.getSideLength() + "</side>\n";
        triangleXML += "</Triangle>\n";
        return triangleXML;
    }

    public static String squareToXML(Square square) {
        String xmlString = "<Square>\n";
        xmlString += "\t<side>" + square.getSideLength() + "</side>\n";
        xmlString += "</Square>\n";
        return xmlString;
    }

    public static String circleToXml(Circle circle) {
        String xmlString = "<Circle>\n";
        xmlString += "\t<radius>" + circle.getRadius() + "</radius>\n";
        xmlString += "</Circle>\n";
        return xmlString;
    }



    private static String groupToXml(Group group) {
        StringBuilder xmlString = new StringBuilder();
        xmlString.append("<Group>\n\t<shapes>\n");
        List<Shape> shapes = group.getShapes();
        for (Shape shape : shapes) {
            String[] lines = shapeToXml(shape).split("\n");
            for (String line: lines) {
                xmlString.append("\t\t").append(line).append("\n");
            }
        }
        xmlString.append("\t</shapes>\n</Group>\n");
        return xmlString.toString();
    }

}
