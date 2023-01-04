package ConceptAndCoding.DecoratorPattern.src.Decorator;

import ConceptAndCoding.DecoratorPattern.src.BasePizza;

public class Mushroom extends ToppingDecorator{
    BasePizza pizza;

    public Mushroom(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 25;
    }
}
