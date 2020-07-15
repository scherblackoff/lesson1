package lesson_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        doSomethingWithArray();
        doSomethingWithBoxOfFruit();
    }

    public static void doSomethingWithArray() {
        Stats<Integer> nums = new Stats<>(14, 32, 12, 43, 23, 13, 19);
        nums.swap(32, 19);
        nums.print();
        List<Integer> list = nums.doArrayList();
    }

    public static void doSomethingWithBoxOfFruit() {
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Orange orange = new Orange();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Apple apple = new Apple();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange1);
        orangeBox.addFruit(orange2);
        appleBox.addFruit(apple);
        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);
        System.out.println(orangeBox.getWeightBox());
        System.out.println(appleBox.getWeightBox());
        System.out.println(orangeBox.compareBox(appleBox));
        orangeBox.takeOver(orangeBox1);
        System.out.println(orangeBox.getWeightBox());
        System.out.println(orangeBox1.getWeightBox());
        System.out.println(orangeBox.getFruits().size());
        System.out.println(orangeBox1.getFruits().size());
    }
}
