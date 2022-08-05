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
        float in1 = 140;
        float expected1 = 2;
        float out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2. Test result : " + passed1);

        float rubleE = Converter.euroToRuble(2);
        System.out.println("2 euro are " + rubleE + " ruble.");
        float in2 = 2;
        float expected2 = 140;
        float out2 = Converter.euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("2 euro are 140. Test result : " + passed2);

        float dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollars.");
        float in3 = 120;
        float expected3 = 2;
        float out3 = Converter.rubleToDollar(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("120 rubles are 2. Test result : " + passed3);

        float rubleD = Converter.dollarToRuble(2);
        System.out.println("2 dollars are " + rubleD + " ruble.");
        float in4 = 2;
        float expected4 = 120;
        float out4 = Converter.dollarToRuble(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("2 dollars are 120. Test result : " + passed4);
    }
}
