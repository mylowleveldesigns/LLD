package ConceptAndCoding.FactoryPatternVsAbstractFactoryPattern.src;

public class Demo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        ShapeI shapeObj = factory.getShape("Rectangle");
        shapeObj.draw();
    }
}
