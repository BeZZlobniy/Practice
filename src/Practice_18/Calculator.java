package Practice_18;

public class Calculator {
    public static <T extends Number> double sum(T digit1, T digit2) {
        return digit1.doubleValue() + digit2.doubleValue();
    }

    public static <T extends Number> double sub(T digit1, T digit2) {
        return digit1.doubleValue() - digit2.doubleValue();
    }

    public static <T extends Number> double mul(T digit1, T digit2) {
        return digit1.doubleValue() * digit2.doubleValue();
    }

    public static <T extends Number> double div(T digit1, T digit2) {
        return digit1.doubleValue() / digit2.doubleValue();
    }
}

