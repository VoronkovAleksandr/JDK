/*
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 */
public class Task_2 {


    public static <T extends Number> Number sum(T first, T second) {
        return first.byteValue() + second.byteValue();
    }

    public static <T extends Number> Number multiply(T first, T second) {
        return first.byteValue() * second.byteValue();
    }

    public static <T extends Number> Number divide(T first, T second) {
        if (second.equals(0)) {
            throw new RuntimeException("На ноль делить нельзя");
        }
        return first.byteValue() / second.byteValue();
    }
    public static <T extends Number> Number subtract(T first, T second) {
        return first.byteValue() - second.byteValue();
    }
}