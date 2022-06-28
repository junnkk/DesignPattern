package pizza;

public class NYPizzaStore extends PizzaStore{

    protected Pizza createPizza(String item){
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
			Pizza pizza = new CheesePizza(ingredientFactory);
			pizza.setName("뉴욕 치즈피자");
			return pizza;
		} else if (item.equals("veggie")) {
			Pizza pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("뉴욕 야체피자");
			return pizza;
		} else return null;
    }
    
}
