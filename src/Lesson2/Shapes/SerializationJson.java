package Lesson2.Shapes;

public class SerializationJson {
    public static void toJson(Circle circle) {
        System.out.println("{" + "\n" + "\t" + "\"" + "color" + "\"" + ":" + " " + "\"" + circle.getColor() + "\"" + "," + "\n" +
                    "\t" + "\"" + "diameter" + "\"" + ":" + " " + "\"" + circle.getDiameter() + "\"" + "\n" + "}" + ",");
    }

    public static void toJson(Square square) {
        System.out.println("{" + "\n" + "\t" + "\"" + "color" + "\"" + ":" + " " + "\"" + square.getColor() + "\"" + "," + "\n" +
                "\t" + "\"" + "one side length" + "\"" + ":" + " " + "\"" + square.getOneSideLength() + "\"" + "\n" + "}" + ",");
    }

    public static void toJson(Triangle triangle) {
        System.out.println("{" + "\n" + "\t" + "\"" + "color" + "\"" + ":" + " " + "\"" + triangle.getColor() + "\"" + "," + "\n" +
                "\t" + "\"" + "side A length" + "\"" + ":" + " " + "\"" + triangle.getSideALength() + "\"" + "," + "\n" +
                "\t" + "\"" + "side B length" + "\"" + ":" + " " + "\"" + triangle.getSideBLength() + "\"" + "," + "\n" +
                "\t" + "\"" + "side C length" + "\"" + ":" + " " + "\"" + triangle.getSideCLength() + "\"" + "," + "\n" + "}" + ",");
    }

    public static void toJson(Group group) {
        group.merge();
//                for (Group g: group) {
//
//        }
    }
}
