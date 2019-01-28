package Lesson2.BuilderPattern;

// 2.1 Написать паттерн Builder

public class BuilderExample {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle.BicycleBuilder("Scott", "Cyclocross", "M")
                .doBikeHaveMultipleGears(true)
                .doBikeHaveSuspention(false).build();

    }
}
