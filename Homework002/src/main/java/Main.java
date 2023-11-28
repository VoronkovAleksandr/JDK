import java.util.ArrayList;
import java.util.List;

/*
Описать команду разработчиков. В команде разработчиков могут находиться бэкендеры,
которые в состоянии писать серверный код, фронтендеры, которые могут программировать экранные формы, и фуллстэк разработчики, совмещающие в себе обе компетенции.
Реализовать класс фулстэк разработчика, создать экземпляр и последовательно вызвать
все его методы.
 */

public class Main {

    public static void main(String[] args) {
        List<Developer> team = new ArrayList<Developer>();
        team.add(new FullstackDeveloper());
        team.add(new Frontender() {
            @Override
            public void developGUI() {
                System.out.println("Разрабатываю графический интерфейс");
            }
        });
        team.add(new Backender() {
            @Override
            public void developServer() {
                System.out.println("Разрабатываю сервер");
            }
        });

        for (Developer dev: team) {
            if (dev instanceof FullstackDeveloper){
                ((FullstackDeveloper) dev).developGUI();
                ((FullstackDeveloper) dev).developServer();
            } else if (dev instanceof Frontender) {
                ((Frontender) dev).developGUI();
            } else if (dev instanceof Backender) {
                ((Backender) dev).developServer();
            }
        }
    }
}
