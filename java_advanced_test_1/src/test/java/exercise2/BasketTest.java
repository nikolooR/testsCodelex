package exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    @Test
    void testBasketAddMethod(){
        Basket<Apple> basket = new Basket<>();
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
    }
    @Test
    void testBasketRemoveMethod(){
        Basket<Mushroom> basket = new Basket<>();
        basket.addToBasket(new Mushroom());
        basket.removeFromBasket(new Mushroom());
        basket.removeFromBasket(new Mushroom());
    }

}