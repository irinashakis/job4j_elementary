package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (!name.isEmpty()) {
            char first = name.charAt(0);
            if (!Character.isUpperCase(first) && !Character.isDigit(first) && !isSpecialSymbol(first)) {
                for (int i = 1; i < name.length(); i++) {
                    int code = name.codePointAt(i);
                    if (isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code) || Character.isDigit(code)) {
                        return true;
                    }
                }
            }
        }
        return false;
        }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
