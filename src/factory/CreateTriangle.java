package factory;

public class CreateTriangle extends Create{
    @Override
    public ShapeFactory createShape() {
        return new Triangle();
    }
}
