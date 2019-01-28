package Lesson2.Shapes;

public class SerializationXml {
    public static void toXml() {
            /*

            <xml>
                <color>color</color>
                <diameter>diameter</diameter>
            </xml>

             */

        System.out.println("<xml>" + "\n\t" + "<color>" + color + "</color>" + "\n\t" + "<diameter>" + diameter + "</diameter>" +
                "\n" + "</xml>" + ",");
    }
}
