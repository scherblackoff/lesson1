package lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();
    private double weightBox = 0;


    public boolean addFruit(T fruit) {
        fruits.add(fruit);
        weightBox += fruit.getWeight();
        return true;
    }

    public boolean removeFruit(int i) {
        weightBox -= fruits.get(i).getWeight();
        fruits.remove(i);
        return true;
    }

    public double getWeightBox() {
        return weightBox;
    }

    public boolean compareBox(Box<?> anotherFruits) {
        if (weightBox == anotherFruits.getWeightBox()) {
            return true;
        }
        return false;
    }

    public void takeOver(Box<T> anotherBox) {
        for (int i = 0; i < fruits.size(); i++) {
            anotherBox.addFruit(fruits.get(i));
        }
        for (int j = fruits.size() - 1; j >= 0; j--) {
            removeFruit(j);
        }
    }

    public List<T> getFruits() {
        return fruits;
    }
}
