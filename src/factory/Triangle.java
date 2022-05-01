package factory;

public class Triangle implements ShapeFactory {
    @Override
    public void print() {
        System.out.println("Triangle class");
    }
}
