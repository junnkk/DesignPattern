package pizza;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    
    public Dough createDough(){
        return new ThickCrustDough();
    }
    
    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }

    public Cheese createCheese(){
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies(){
        Veggies veggies[] = { new EggPlant(), new BlackOlives()};
        return veggies;
    }
    
}
