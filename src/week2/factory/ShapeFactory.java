package week2.factory;

import java.util.Scanner;

interface Shape {

    void draw();

}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println(
                "   _____    \n" +
                "  /     \\  \n" +
                " /       \\ \n" +
                " |        | \n" +
                " \\        /\n" +
                "  \\______/ \n"
        );
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println(
            "     /\\    \n" +
            "    /  \\  \n" +
            "   /    \\ \n" +
            "  /______\\ \n"
        );
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println(
            "___________\n" +
            "|          |\n" +
            "|          |\n" +
            "|          |\n" +
            "|          |\n" +
            "|__________|\n"
        );
    }
}

public class ShapeFactory {

    public Shape shapeFromName(String name) throws Exception {

        switch (name.toLowerCase()) {
            case "egg":
            case "circle":
                return new Circle();
            case "triangle":
                return new Triangle();
            case "square":
                return new Square();
            default:
                throw new Exception("Shape '" + name + "' is not implemented.");
        }
    }

}

class Main {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        System.out.println("Enter the name of the shape you want to make and press Return:");
        Scanner scanner = new Scanner(System.in);

        try {
            Shape shape = factory.shapeFromName(scanner.nextLine());
            shape.draw();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
