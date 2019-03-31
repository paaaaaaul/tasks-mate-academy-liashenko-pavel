package Lesson2.ShapesSerialization;

import java.util.List;

public class Group implements Shape {

    private List<Shape> shapes;

    public Group(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    @Override
    public void print() {
        //TODO in for loop make an output for shapes
        System.out.println("Group output: ");
    }
}
