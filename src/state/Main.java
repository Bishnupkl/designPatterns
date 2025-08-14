package state;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.insertCoin();
        coffeeMachine.selectCoffee();
        coffeeMachine.selectCoffee();
        coffeeMachine.dispenseCoffee();
    }
}
