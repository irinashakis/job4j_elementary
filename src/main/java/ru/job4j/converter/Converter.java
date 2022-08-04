package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value * 70;
    }

    public static float euroToRuble(float value) {
        return value * 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float dollarToRuble(float value) {
        return value * 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float rubleE = Converter.euroToRuble(2);
        System.out.println("2 euro are " + rubleE + " ruble.");
        float dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollars.");
        float rubleD = Converter.dollarToRuble(2);
        System.out.println("2 dollars are " + rubleD + " ruble.");
    }
}
