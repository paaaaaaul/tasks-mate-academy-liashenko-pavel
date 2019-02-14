package Lesson2.Shapes;

import java.util.ArrayList;
import java.util.List;

public class Group implements FigureSize{
    private List<FigureSize> figureSizes;

    public Group(List<FigureSize> figureSizes) {
        this.figureSizes = new ArrayList<>(figureSizes);
    }

    public Group() {

    }

    public void addFigure(FigureSize figureSize) {
        figureSizes.add(figureSize);
    }

//    public void rtemoveFigure(Figures figure) {
//        figures.remove(figure);
//    }

    public List<FigureSize> getFigureSize() {
        System.out.println(figureSizes);
        return figureSizes;
    }

    @Override
    public void figureSize() {
        for (FigureSize f: figureSizes) {
            f.figureSize();
        }
    }
}
