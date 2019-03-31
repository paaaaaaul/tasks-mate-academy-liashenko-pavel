package Lesson2.ShapesSerialization;

import java.util.List;

public class SerializeJSON {

    public static String anyShapeEncoding(Shape shape) {
        String jsonString = "";
        jsonString += shapeToJson(shape);
        return jsonString;
    }

    public static String shapeToJson (Shape shape) {
        String jsonString = "";
        if (shape instanceof Triangle) {
            jsonString += triangleToJson((Triangle) shape);
        } else if (shape instanceof Square) {
            jsonString += squareToJson((Square) shape);
        } else if (shape instanceof Circle) {
            jsonString += circleToJson((Circle) shape);
        } else if (shape instanceof Group) {
            jsonString += groupToJson((Group) shape);
        }
        return jsonString;
    }

    public static String triangleToJson(Triangle triangle) {
        String triangleJson = "\t{\n";
        triangleJson += "\t\t\"side\" : \"" + triangle.getSideLength() + "\",\n";
        triangleJson += "\t}";
        return triangleJson;
    }

    public static String squareToJson(Square square) {
        String squareToJson = "\t{\n";
        squareToJson += "\t\t\"side\" : \"" + square.getSideLength() + "\",\n";
        //как убрать запятую в конце?
        squareToJson += "\t}";
        return squareToJson;
    }

    public static String circleToJson(Circle circle) {
        String circleToJson = "\t{\n";
        circleToJson += "\t\t\"radius\" : \"" + circle.getRadius() + "\",\n";
        circleToJson +="\t}";
        return circleToJson;
    }

    public static String groupToJson(Group group) {
        StringBuilder jsonGroupString = new StringBuilder();
        jsonGroupString.append("{ \"shapes\" : [\n");
        List<Shape> shapes = group.getShapes();
        for (Shape shape : shapes) {
            String[] lines = shapeToJson(shape).split("\n");
            for (String line : lines) {
                jsonGroupString.append("\t").append(line).append("\n");
            }
            jsonGroupString.setCharAt(jsonGroupString.length() - 1, ',');
            jsonGroupString.append("\n");
        }
        jsonGroupString.deleteCharAt(jsonGroupString.length() - 2);
        jsonGroupString.append("\t]}");
        return jsonGroupString.toString();
    }


}
