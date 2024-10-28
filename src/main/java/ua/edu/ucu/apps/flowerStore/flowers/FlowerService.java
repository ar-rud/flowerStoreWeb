package ua.edu.ucu.apps.flowerStore.flowers;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {

    public List<Flower> getFlowers() {
        return List.of(new Flower(80, FlowerColor.RED,50, FlowerType.ROSE),
                new Flower(90, FlowerColor.YELLOW,60, FlowerType.TULIP),
                new Flower(130, FlowerColor.WHITE,90, FlowerType.CHAMOMILE));
    }
}
