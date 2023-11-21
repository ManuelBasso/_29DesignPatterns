//Crea una factory class che abbia un metodo che ritorni la forma corretta (shape)
// in base all'enum in input.

public class ShapeFactory {

    public static Shape getShape(typeShapes type) {
        Shape shape;
        switch (type) {
            case CIRCLE -> shape = new Circle();
            case TRIANGLE -> shape = new Triangle();
            case RECTANGLE -> shape = new Rectangle();
            default -> shape = null;
        }
        return shape;
    }
}
