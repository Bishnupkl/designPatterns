package strategy;

public class BitCoinStrategy implements  PaymentStrategy{
    private String walletAddress;


    public BitCoinStrategy(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {

        System.out.println("Paid "+ amount+" using Bit Coin");


    }

}
