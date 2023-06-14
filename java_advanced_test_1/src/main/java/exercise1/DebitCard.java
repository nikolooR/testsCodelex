package exercise1;

public class DebitCard extends Card {
    public DebitCard(int bankCardNumber, String ownerName, int ccvCode, int balance) {
        super(bankCardNumber, ownerName, ccvCode, balance);
    }

    @Override
    void addMoney(int money) {
        balance += money;
        if (balance > 10000) {
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    void takeMoney(int money) {
        try {
            if (money > getBalance()) {
                throw new NotEnoughFundsException();
            }
            balance -= money;
        } catch (NotEnoughFundsException n) {
            System.out.println("you dont have enough money... deposit please");
        }
    }
}
