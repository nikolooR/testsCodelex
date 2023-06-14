package exercise1;

public abstract class Card {
    private int bankCardNumber;
    private String ownerName;
    private int ccvCode;
    protected int balance;

    public Card(int bankCardNumber, String ownerName, int ccvCode, int balance) {
        this.bankCardNumber = bankCardNumber;
        this.ownerName = ownerName;
        this.ccvCode = ccvCode;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    abstract void addMoney(int money);

    abstract void takeMoney(int money);


}
