package factory;

public class Rectangle implements ShapeFactory {
    @Override
    public void print() {
        System.out.println("Rectangle class");
    }
}
