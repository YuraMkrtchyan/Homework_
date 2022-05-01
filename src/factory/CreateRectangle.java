package factory;

public class CreateRectangle extends Create{
    @Override
    public ShapeFactory createShape() {
        return new Rectangle();
    }
}
