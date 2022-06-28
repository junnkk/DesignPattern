package pizza;

public class ChicagoPizzaStore extends PizzaStore{

    protected Pizza createPizza(String item){
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
			Pizza pizza = new CheesePizza(ingredientFactory);
			pizza.setName("시카고 치즈피자");
			return pizza;
		} else if (item.equals("veggie")) {
			Pizza pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("시카고 야체피자");
			return pizza;
		} else return null;
    }

    
}
