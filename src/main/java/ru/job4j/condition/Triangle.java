package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && bc + ab > ac;
    }

    public static void main(String[] args) {
        System.out.println(exist(3, 6, 8));
        System.out.println(exist(2, 5, 10));
    }
}
