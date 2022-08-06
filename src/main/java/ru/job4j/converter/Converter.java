package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
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
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float rubleE = Converter.euroToRuble(2);
        System.out.println("2 euro are " + rubleE + " ruble.");
        in = 2;
        expected = 140;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("2 euro are 140. Test result : " + passed);

        float dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollars.");
        in = 120;
        expected = 2;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed);

        float rubleD = Converter.dollarToRuble(2);
        System.out.println("2 dollars are " + rubleD + " ruble.");
        in = 2;
        expected = 120;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("2 dollars are 120. Test result : " + passed);
    }
}
