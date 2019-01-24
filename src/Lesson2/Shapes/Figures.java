package Lesson2.Shapes;

/*
2.6 Вам нужно написать программу содержащую три класса Triangle, Circle, Square,
а так же класс Group, который будет содержать любое количество фигур включая другие группы.
Так же нужно написать несколько классов,
которые будут выполнять сериализацию дерева фигур в формат XML и JSON.
*/


import java.util.ArrayList;

public class Figures {
   private ArrayList figures = new ArrayList();
   public Figures(){}

    public ArrayList getFigures() {
        return figures;
    }

    public void setFigures(ArrayList figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {

      // ??????

       return figures + " ";
    }
}
