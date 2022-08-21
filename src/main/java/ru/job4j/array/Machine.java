package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int temp = money - price;
        for (int i = 0; i < 4; i++) {
            while (temp >= coins[i]) {
                temp = temp - coins[i];
                rsl[size] = coins[i];
                size++;
            }
        }
            return Arrays.copyOf(rsl, size);
        }
}

