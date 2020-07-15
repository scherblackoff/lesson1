package lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Stats<T> {

    private final T[] nums;

    public Stats(T... nums) {
        this.nums = nums;
    }

    public void swap(T number1, T number2) {
        try {
            int i = getIndex(number1);
            int j = getIndex(number2);
            T temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        } catch (NullPointerException e) {
            System.out.println("Данные числа поменять местами невозможно.\nПосмотри на элементы массива еще раз и введи существующие.");
        }

    }

    public List<T> doArrayList() {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        return list;
    }

    private Integer getIndex(T number) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == number) {
                return i;
            }
        }
        return null;
    }

    public void print() {
        for (T num : nums) {
            System.out.print("[" + num + "] ");
        }
        System.out.println();
    }
}
