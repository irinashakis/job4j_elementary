package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first > second && first > third ? first : third;
        if (second > result) {
            result = second;
        }
        return result;
    }
}
