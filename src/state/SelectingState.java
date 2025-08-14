package state;

public class SelectingState implements  CoffeeMachineState{
    private CoffeeMachine coffeeMachine;

    public SelectingState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please do not insert coin again. Please select Coffee");
    }

    @Override
    public void selectCoffee() {
        System.out.println("Coffee is being made...");
        coffeeMachine.setState(coffeeMachine.getDispensingState());

    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Please select Coffee first");

    }
}
