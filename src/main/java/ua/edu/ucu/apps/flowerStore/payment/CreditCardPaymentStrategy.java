package ua.edu.ucu.apps.flowerStore.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.flowerStore.flowers.Item;
import lombok.AllArgsConstructor;
import java.util.List;

@AllArgsConstructor @Setter @Getter
public class CreditCardPaymentStrategy implements Payment{
    private String description;

    @Override
    public double pay(List<Item> items){
        double price = 0;
        for (Item item : items) {
            price += item.getPrice();

        }
        System.out.println("Paid with credit card: " + price);
        return price;
    }

}
