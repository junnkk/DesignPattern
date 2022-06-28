package pizza;

public class PizzaTestDrive {
    
    public static void main(String[] args){
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

        System.out.println();

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("veggie");
    }
    
}
