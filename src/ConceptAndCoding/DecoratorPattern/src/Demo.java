package ConceptAndCoding.DecoratorPattern.src;

import ConceptAndCoding.DecoratorPattern.src.Decorator.ExtraCheese;
import ConceptAndCoding.DecoratorPattern.src.Decorator.Mushroom;

public class Demo {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new Farmhouse());
        System.out.println(pizza.cost()); // Farmohouse with extra cheese

        BasePizza pizza1 = new Mushroom(pizza);
        System.out.println(pizza1.cost()); // Farmhouse Decorated with cheese and mushroom

        BasePizza pizza2 = new ExtraCheese(new Mushroom(new Farmhouse())); // Decorated Farhouse with mushroom and extracheese
        System.out.println(pizza2.cost());
    }
}
