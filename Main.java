public class PizzaBillGenerator {

    public static void main(String[] args) {
        
//        Pizza basePizza = new Pizza(false);
//        basePizza.addExtraCheese();
//        basePizza.addExtraToppings();
//        basePizza.takeAway();
//        basePizza.getBill();

            DeluxePizza dp = new DeluxePizza(true);
            dp.addExtraCheese();
            dp.addExtraToppings();
            dp.getBill();
    }
}
