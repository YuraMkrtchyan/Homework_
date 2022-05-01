package factory;

public class Circle implements ShapeFactory {
    @Override
    public void print() {
        System.out.println("Circle class");
    }
}
