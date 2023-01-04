package ConceptAndCoding.FactoryPatternVsAbstractFactoryPattern.src;

public class ShapeFactory {
    ShapeI getShape(String input) {
        switch (input){
            case "Rectangle": return new Rectangle();
            case "Circle": return new Circle();
            default: return null;
        }
    }
}
