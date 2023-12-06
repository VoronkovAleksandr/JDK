/*
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 */
public class Task_2 {


    public static <T extends Number> double sum(T first, T second) {
        return first.doubleValue() + second.doubleValue();
    }

    public static <T extends Number> double multiply(T first, T second) {
        return first.doubleValue() * second.doubleValue();
    }

    public static <T extends Number> double divide(T first, T second) {
        if (second.equals(0)) {
            throw new RuntimeException("На ноль делить нельзя");
        }
        return first.doubleValue() / second.doubleValue();
    }

    public static <T extends Number> double subtract(T first, T second) {
        return first.doubleValue() - second.doubleValue();
    }
}