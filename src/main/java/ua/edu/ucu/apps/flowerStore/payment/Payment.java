package ua.edu.ucu.apps.flowerStore.payment;

import ua.edu.ucu.apps.flowerStore.flowers.Item;

import java.util.List;

public interface Payment {
    double pay(List<Item> items);
}
