package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> basketItems;
    private int currentState = 0;

    public Basket() {
        basketItems = new ArrayList<>();
    }

    public void addToBasket(T item) {
        try {
            if (currentState < 10) {
                basketItems.add(item);
                currentState++;
            } else {
                throw new BasketFullException();
            }
        } catch (BasketFullException e) {
            System.out.println("basket is full");
        }
    }

    public void removeFromBasket(T item) {
        try {
            if (currentState == 0) {
                throw new BasketEmptyException();
            }
            basketItems.remove(item);
            currentState--;
        } catch (BasketEmptyException e) {
            System.out.println("can not remove, basket is empty");
        }
    }
}
