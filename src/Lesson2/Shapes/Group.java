package Lesson2.Shapes;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List <Figures> figures = new ArrayList<Figures>();

    public void addShape(Figures figure) {
        figures.add(figure);
    }

    public void rtemoveFigure(Figures figure) {
        figures.remove(figure);
    }

    public void merge() {
        for (Figures f : figures) {
            System.out.println(figures);
        }
//        System.out.println(figures.size());
    }

}
