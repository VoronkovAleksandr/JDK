import java.util.ArrayList;

/*
Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае.
Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.
Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений пары, а также переопределение метода toString(), возвращающее строковое представление пары.
 */
public class Task_3 {
    public static <T> boolean compareArrays(ArrayList<T> firstArray, ArrayList<T> secondArray){
        if (firstArray.size() != secondArray.size()){
            return false;
        }
        for (int i = 0; i < firstArray.size(); i++) {
            if (!firstArray.get(i).equals(secondArray.get(i))){
                return false;
            }
        }
        return true;
    }
}
