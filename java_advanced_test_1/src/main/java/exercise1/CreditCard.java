package exercise1;

public class CreditCard extends Card {
    public CreditCard(int bankCardNumber, String ownerName, int ccvCode, int balance) {
        super(bankCardNumber, ownerName, ccvCode, balance);
    }

    @Override
    void addMoney(int money) {
        balance += money;
    }

    @Override
    void takeMoney(int money) {
        try {
            if (money > getBalance()) {
                throw new NotEnoughFundsException();
            }
            balance -= money;
            if (balance < 100) {
                System.out.println("Warning: Low funds");
            }
        } catch (NotEnoughFundsException n) {
            System.out.println("you dont have enough money... deposit please");
        }
    }
}
