import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//  Выполнение задания 1
        Task_1<String> myList = new Task_1<>();
        myList.addElement("1");
        myList.addElement("Это");
        myList.addElement("строка");
        myList.addElement("вот");
        myList.addElement("так");
        myList.printList();

        System.out.println("Вывод через for-each");
        for (String str:
             myList) {
            System.out.println(str);
        }
//  Выполнение задания 2

        System.out.println(Task_2.sum(1, 2.0f));
        System.out.println(Task_2.multiply(1, 2.0f));
        System.out.println(Task_2.divide(1, 74871263406203489L));
        System.out.println(Task_2.subtract(1, 2.0f));
//  Выполнение задания 3
        ArrayList<Integer> firstArray = new ArrayList<Integer>();
        ArrayList<Integer> secondArray = new ArrayList<Integer>();
        firstArray.add(1);
        firstArray.add(2);
        firstArray.add(3);
        firstArray.add(4);
        secondArray.add(1);
        secondArray.add(2);
        secondArray.add(3);
        secondArray.add(5);
        System.out.println(Task_3.compareArrays(firstArray,secondArray));
        ArrayList<String> firstStringArray = new ArrayList<>();
        ArrayList<String> secondStringArray = new ArrayList<>();
        firstStringArray.add("1");
        firstStringArray.add("2");
        firstStringArray.add("3");
        firstStringArray.add("4");
        secondStringArray.add("1");
        secondStringArray.add("2");
        secondStringArray.add("3");
        secondStringArray.add("4");
        secondStringArray.add("4");
        System.out.println(Task_3.compareArrays(firstStringArray, secondStringArray));
    }
}
