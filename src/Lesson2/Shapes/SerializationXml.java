package Lesson2.Shapes;

public class SerializationXml {
    public static void toXml(Circle circle) {
        System.out.println("<Circle>" + "\n\t" + "<color>" + circle.getColor() + "</color>" + "\n\t"
                + "<diameter>" + circle.getDiameter() + "</diameter>" + "\n" + "</Circle>" + ",");
    }


    public static void toXml(Square square) {
        System.out.println("<Circle>" + "\n\t" + "<color>" + square.getColor() + "</color>" + "\n\t"
                + "<diameter>" + square.getOneSideLength() + "</diameter>" + "\n" + "</Circle>" + ",");
    }

    public static void toXml(Triangle triangle) {
        System.out.println("<Circle>" + "\n\t" + "<color>" + triangle.getColor() + "</color>"
                + "\n\t" + "<diameter>" + triangle.getSideALength() + "</diameter>" + "\n" + "</Circle>" + ",");
    }


}
