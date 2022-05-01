package factory;

public class CreateCircle extends Create{
    @Override
    public ShapeFactory createShape() {
        return new Circle();
    }
}
