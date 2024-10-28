package ua.edu.ucu.apps.flowerStore.payment;

import ua.edu.ucu.apps.flowerStore.flowers.Item;

import java.util.List;

public class PayPalPaymentStrategy implements Payment{
    private String description;

    @Override
    public double pay(List<Item> items) {
        double price = 0;
        for (Item item : items) {
            price += item.getPrice();

        }
        System.out.println("Paid with credit card: " + price);
        return price;
    }
}
