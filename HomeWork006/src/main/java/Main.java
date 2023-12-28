/*
реализовать Java приложение для демонстрации парадокса Монти Холла (Парадокс Монти Холла — Википедия)
и наглядно убедиться в верности парадокса (запустить игру в цикле на 1000 и вывести итоговый счет).
Студенту необходимо:
Создать свой Java Maven/Gradle проект;
Реализовать прикладную задачу - приложение для демонстрации парадокса Монти Холла;
Можно добавить любые библиотеки которые считают необходимыми
Результаты должны быть сохранены в HashMap (шаг цикла -> результат)
Необходимо вывести статистику по результату - количество позитивных и негативных результатов, процент от общего количества шагов цикла.
 */
public class Main {
    public static void main(String[] args) {

        Player playerNoChangeChoice = new Player();
        Player playerChangeChoice = new Player();
        playerNoChangeChoice.setStrategyChangeChoice(false);
        playerChangeChoice.setStrategyChangeChoice(true);
        Action action1 = new Action(3, 500,playerNoChangeChoice);
        Action action2 = new Action(3, 500,playerChangeChoice);
        action1.start();
        action2.start();

    }

}
