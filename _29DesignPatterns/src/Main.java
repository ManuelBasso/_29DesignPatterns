public class Main {
    public static void main(String[] args) {
        String input = "TRIANGLE";
        String input2 = "CIRCLE";
        String input3 = "RECTANGLE";


        Shape first = ShapeFactory.getShape(typeShapes.valueOf(input));
        Shape second = ShapeFactory.getShape(typeShapes.valueOf(input2));
        Shape third = ShapeFactory.getShape(typeShapes.valueOf(input3));

        first.draw();
        second.draw();
        third.draw();
    }
}