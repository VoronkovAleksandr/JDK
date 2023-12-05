public class Main {
    public static void main(String[] args) {
//        Выполнение задания 1
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
    }
}
