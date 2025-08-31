// Component
interface Pizza {
    int getCost();
}

// Concrete Component (Base)
class BasePizza implements Pizza {
    public int getCost() { return 100; }
}

// Abstract Decorator
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;
    public PizzaDecorator(Pizza pizza) { this.pizza = pizza; }
}

// Concrete Decorators
class LeanCrust extends PizzaDecorator {
    public LeanCrust(Pizza pizza) { super(pizza); }
    public int getCost() { return pizza.getCost() + 40; }
}

class CheeseBurst extends PizzaDecorator {
    public CheeseBurst(Pizza pizza) { super(pizza); }
    public int getCost() { return pizza.getCost() + 60; }
}

class Mushroom extends PizzaDecorator {
    public Mushroom(Pizza pizza) { super(pizza); }
    public int getCost() { return pizza.getCost() + 30; }
}

class Olives extends PizzaDecorator {
    public Olives(Pizza pizza) { super(pizza); }
    public int getCost() { return pizza.getCost() + 20; }
}

// Usage
public class Main {
    public static void main(String[] args) {
        // Step-by-step wrapping
        Pizza stepPizza = new BasePizza();
        stepPizza = new LeanCrust(stepPizza);
        stepPizza = new CheeseBurst(stepPizza);
        stepPizza = new Mushroom(stepPizza);
        System.out.println("Step-by-step Cost: " + stepPizza.getCost()); // 230

        // Inline wrapping
        Pizza inlinePizza = new Mushroom(new CheeseBurst(new LeanCrust(new BasePizza())));
        System.out.println("Inline Cost: " + inlinePizza.getCost()); // 230
    }
}
